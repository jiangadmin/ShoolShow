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
public class Floor_34_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_11_Fragment";

    TextView r_400, r_401, r_402, r_403, r_404, r_405, r_408, r_409, r_410, r_412, r_413, r_416, r_417, r_418, r_426, r_427, r_428;

    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_3_4, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_400 = view.findViewById(R.id.building_3_4_400);
        r_401 = view.findViewById(R.id.building_3_4_401);
        r_402 = view.findViewById(R.id.building_3_4_402);
        r_403 = view.findViewById(R.id.building_3_4_403);
        r_404 = view.findViewById(R.id.building_3_4_404);
        r_405 = view.findViewById(R.id.building_3_4_405);
        r_408 = view.findViewById(R.id.building_3_4_408);
        r_409 = view.findViewById(R.id.building_3_4_409);
        r_410 = view.findViewById(R.id.building_3_4_410);
        r_412 = view.findViewById(R.id.building_3_4_412);
        r_413 = view.findViewById(R.id.building_3_4_413);
        r_416 = view.findViewById(R.id.building_3_4_416);
        r_417 = view.findViewById(R.id.building_3_4_417);
        r_418 = view.findViewById(R.id.building_3_4_418);
        r_426 = view.findViewById(R.id.building_3_4_426);
        r_427 = view.findViewById(R.id.building_3_4_427);
        r_428 = view.findViewById(R.id.building_3_4_428);

        r_400.setOnClickListener(this);
        r_401.setOnClickListener(this);
        r_402.setOnClickListener(this);
        r_403.setOnClickListener(this);
        r_404.setOnClickListener(this);
        r_405.setOnClickListener(this);
        r_408.setOnClickListener(this);
        r_409.setOnClickListener(this);
        r_410.setOnClickListener(this);
        r_412.setOnClickListener(this);
        r_413.setOnClickListener(this);
        r_416.setOnClickListener(this);
        r_417.setOnClickListener(this);
        r_418.setOnClickListener(this);
        r_426.setOnClickListener(this);
        r_427.setOnClickListener(this);
        r_428.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教3－400", r_400);
        map.put("教3－401", r_401);
        map.put("教3－402", r_402);
        map.put("教3－403", r_403);
        map.put("教3－404", r_404);
        map.put("教3－405", r_405);
        map.put("教3－408", r_408);
        map.put("教3－409", r_409);
        map.put("教3－410", r_410);
        map.put("教3－412", r_412);
        map.put("教3－413", r_413);
        map.put("教3－416", r_416);
        map.put("教3－417", r_417);
        map.put("教3－418", r_418);
        map.put("教3－426", r_426);
        map.put("教3－427", r_427);
        map.put("教3－428", r_428);
    }

    @Override
    public void onClick(View v) {
        Map<String,String> map = new HashMap<>();
        map.put("floor", "4");
        switch (v.getId()) {
            case R.id.building_3_4_400:
                map.put("room", "教3－400");
                break;
            case R.id.building_3_4_401:
                map.put("room", "教3－401");
                break;
            case R.id.building_3_4_402:
                map.put("room", "教3－402");
                break;
            case R.id.building_3_4_403:
                map.put("room", "教3－403");
                break;
            case R.id.building_3_4_404:
                map.put("room", "教3－404");
                break;
            case R.id.building_3_4_405:
                map.put("room", "教3－405");
                break;
            case R.id.building_3_4_408:
                map.put("room", "教3－408");
                break;
            case R.id.building_3_4_409:
                map.put("room", "教3－409");
                break;
            case R.id.building_3_4_410:
                map.put("room", "教3－410");
                break;
            case R.id.building_3_4_412:
                map.put("room", "教3－412");
                break;
            case R.id.building_3_4_413:
                map.put("room", "教3－413");
                break;
            case R.id.building_3_4_416:
                map.put("room", "教3－416");
                break;
            case R.id.building_3_4_417:
                map.put("room", "教3－417");
                break;
            case R.id.building_3_4_418:
                map.put("room", "教3－418");
                break;
            case R.id.building_3_4_426:
                map.put("room", "教3－426");
                break;
            case R.id.building_3_4_427:
                map.put("room", "教3－427");
                break;
        }

        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));

    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 34) {
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
