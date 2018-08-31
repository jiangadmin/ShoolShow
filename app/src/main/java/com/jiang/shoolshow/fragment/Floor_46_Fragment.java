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
public class Floor_46_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_46_Fragment";

    TextView r_602, r_607, r_608, r_609;

    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_4_6, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_602 = view.findViewById(R.id.building_4_6_602);
        r_607 = view.findViewById(R.id.building_4_6_607);
        r_608 = view.findViewById(R.id.building_4_6_608);
        r_609 = view.findViewById(R.id.building_4_6_609);

        r_602.setOnClickListener(this);
        r_607.setOnClickListener(this);
        r_608.setOnClickListener(this);
        r_609.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教4－602", r_602);
        map.put("教4－607", r_607);
        map.put("教4－608", r_608);
        map.put("教4－609", r_609);

    }

    @Override
    public void onClick(View v) {
        Map<String, String> map = new HashMap<>();
        map.put("floor", "6");
        switch (v.getId()) {
            case R.id.building_4_6_602: map.put("room", "教4－602");
            break;
            case R.id.building_4_6_607: map.put("room", "教4－607");
            break;
            case R.id.building_4_6_608: map.put("room", "教4－608");
            break;

            case R.id.building_4_6_609: map.put("room", "教4－609");
            break;

        }
        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));

    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 46) {
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
