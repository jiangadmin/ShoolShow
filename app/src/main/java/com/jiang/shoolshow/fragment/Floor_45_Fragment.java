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
public class Floor_45_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_11_Fragment";

    TextView r_507;

    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_4_5, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_507 = view.findViewById(R.id.building_4_5_507);

        r_507.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教4－507", r_507);

    }

    @Override
    public void onClick(View v) {
        Map<String, String> map = new HashMap();
        map.put("floor", "4");
        switch (v.getId()) {
            case R.id.building_4_5_506:
                map.put("room", "教4－506");
                break;
            case R.id.building_4_5_507:
                map.put("room", "教4－507");
                break;
            case R.id.building_4_5_508:
                map.put("room", "教4－508");
                break;
            case R.id.building_4_5_509:
                map.put("room", "教4－509");
                break;
            case R.id.building_4_5_510:
                map.put("room", "教4－510");
                break;
            case R.id.building_4_5_521:
                map.put("room", "教4－521");
                break;
            case R.id.building_4_5_522:
                map.put("room", "教4－522");
                break;
            case R.id.building_4_5_523:
                map.put("room", "教4－523");
                break;
            case R.id.building_4_5_532:
                map.put("room", "教4－532");
                break;
            case R.id.building_4_5_533:
                map.put("room", "教4－533");
                break;
            case R.id.building_4_5_534:
                map.put("room", "教4－534");
                break;

        }
        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));

    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 45) {
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
