package com.jiang.shoolshow.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.activity.ClassRoom_Acivity;
import com.jiang.shoolshow.entity.Floor_Entity;
import com.jiang.shoolshow.utils.LogUtil;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: jiangadmin
 * @date: 2018/7/26
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 楼层
 */
public class Floor_44_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_11_Fragment";

    TextView r_405, r_406, r_409, r_410, r_413, r_414, r_415;

    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_4_4, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_405 = view.findViewById(R.id.building_4_4_405);
        r_406 = view.findViewById(R.id.building_4_4_406);
        r_409 = view.findViewById(R.id.building_4_4_409);
        r_410 = view.findViewById(R.id.building_4_4_410);
        r_413 = view.findViewById(R.id.building_4_4_413);
        r_414 = view.findViewById(R.id.building_4_4_414);
        r_415 = view.findViewById(R.id.building_4_4_415);

        r_405.setOnClickListener(this);
        r_406.setOnClickListener(this);
        r_409.setOnClickListener(this);
        r_410.setOnClickListener(this);
        r_413.setOnClickListener(this);
        r_414.setOnClickListener(this);
        r_415.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教4－405", r_405);
        map.put("教4－406", r_406);
        map.put("教4－409", r_409);
        map.put("教4－410", r_410);
        map.put("教4－413", r_413);
        map.put("教4－414", r_414);
        map.put("教4－415", r_415);

    }

    @Override
    public void onClick(View v) {
        Map<String, String> map = new HashMap<>();
        map.put("floor", "4");
        switch (v.getId()) {
            case R.id.building_4_4_400:
                map.put("room", "教4－400");
                break;
            case R.id.building_4_4_401:
                map.put("room", "教4－401");
                break;
            case R.id.building_4_4_402:
                map.put("room", "教4－402");
                break;
            case R.id.building_4_4_405:
                map.put("room", "教4－405");
                break;
            case R.id.building_4_4_406:
                map.put("room", "教4－406");
                break;
            case R.id.building_4_4_407:
                map.put("room", "教4－407");
                break;
            case R.id.building_4_4_409:
                map.put("room", "教4－409");
                break;
            case R.id.building_4_4_410:
                map.put("room", "教4－410");
                break;
            case R.id.building_4_4_413:
                map.put("room", "教4－413");
                break;
            case R.id.building_4_4_414:
                map.put("room", "教4－414");
                break;
            case R.id.building_4_4_415:
                map.put("room", "教4－415");
                break;
            case R.id.building_4_4_417a:
                map.put("room", "教4－417a");
                break;
            case R.id.building_4_4_417b:
                map.put("room", "教4－417b");
                break;
            case R.id.building_4_4_427:
                map.put("room", "教4－427");
                break;
            case R.id.building_4_4_428:
                map.put("room", "教4－428");
                break;
            case R.id.building_4_4_429:
                map.put("room", "教4－429");
                break;
        }
        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));

    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 44) {
            for (Floor_Entity.ResultBean.SkjsInfoListBean bean : entity.getResult().getSkjsInfoList()) {
                if (map.get(bean.getSkdd()) != null) {
                    map.get(bean.getSkdd()).setBackgroundResource(R.drawable.kuang_red);
                }
            }
        }
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }
}
