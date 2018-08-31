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
public class Floor_36_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_11_Fragment";

    TextView
            r_601, r_602, r_603, r_604, r_606, r_611;
    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_3_6, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_601 = view.findViewById(R.id.building_3_6_601);
        r_602 = view.findViewById(R.id.building_3_6_602);
        r_603 = view.findViewById(R.id.building_3_6_603);
        r_604 = view.findViewById(R.id.building_3_6_604);
        r_606 = view.findViewById(R.id.building_3_6_606);
        r_611 = view.findViewById(R.id.building_3_6_611);

        r_601.setOnClickListener(this);
        r_602.setOnClickListener(this);
        r_603.setOnClickListener(this);
        r_604.setOnClickListener(this);
        r_611.setOnClickListener(this);
        r_606.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教3－601", r_601);
        map.put("教3－602", r_602);
        map.put("教3－603", r_603);
        map.put("教3－604", r_604);
        map.put("教3－611", r_611);
        map.put("教3－606", r_606);

    }

    @Override
    public void onClick(View v) {
        Map<String, String> map = new HashMap<>();
        map.put("floor", "6");
        switch (v.getId()) {
            case R.id.building_3_6_601:
                map.put("room", "教3－601");
                break;
            case R.id.building_3_6_602:
                map.put("room", "教3－602");
                break;
            case R.id.building_3_6_603:
                map.put("room", "教3－603");
                break;
            case R.id.building_3_6_604:
                map.put("room", "教3－604");
                break;
            case R.id.building_3_6_611:
                map.put("room", "教3－611");
                break;
            case R.id.building_3_6_606:
                map.put("room", "教3－606");
                break;
        }

        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));

    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 36) {
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
