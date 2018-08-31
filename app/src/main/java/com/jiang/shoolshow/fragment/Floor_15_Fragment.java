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
import com.jiang.shoolshow.entity.Const;
import com.jiang.shoolshow.entity.Floor_Entity;
import com.jiang.shoolshow.utils.AnimUtils;
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
public class Floor_15_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_15_Fragment";

    TextView  r_501, r_502, r_503, r_504, r_505, r_506, r_507, r_508, r_509, r_510;
    
    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_1_5, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_501 = view.findViewById(R.id.building_1_5_501);
        r_502 = view.findViewById(R.id.building_1_5_502);
        r_503 = view.findViewById(R.id.building_1_5_503);
        r_504 = view.findViewById(R.id.building_1_5_504);
        r_505 = view.findViewById(R.id.building_1_5_505);
        r_506 = view.findViewById(R.id.building_1_5_506);
        r_507 = view.findViewById(R.id.building_1_5_507);
        r_508 = view.findViewById(R.id.building_1_5_508);
        r_509 = view.findViewById(R.id.building_1_5_509);
        r_510 = view.findViewById(R.id.building_1_5_510);

        r_501.setOnClickListener(this);
        r_502.setOnClickListener(this);
        r_503.setOnClickListener(this);
        r_504.setOnClickListener(this);
        r_505.setOnClickListener(this);
        r_506.setOnClickListener(this);
        r_507.setOnClickListener(this);
        r_508.setOnClickListener(this);
        r_509.setOnClickListener(this);
        r_510.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教1－501", r_501);
        map.put("教1－502", r_502);
        map.put("教1－503", r_503);
        map.put("教1－504", r_504);
        map.put("教1－505", r_505);
        map.put("教1－506", r_506);
        map.put("教1－507", r_507);
        map.put("教1－508", r_508);
        map.put("教1－509", r_509);
        map.put("教1－510", r_510);

        AnimUtils.S(view.findViewById(R.id.floor_view), 0, Const.f_1_s);

    }

    @Override
    public void onClick(View v) {
        Map<String,String> map = new HashMap<>();
        map.put("floor", "5");
        switch (v.getId()) {
            case R.id.building_1_5_501:
                map.put("room", "教1－501");
                break;
            case R.id.building_1_5_502:
                map.put("room", "教1－502");
                break;
            case R.id.building_1_5_503:
                map.put("room", "教1－503");
                break;
            case R.id.building_1_5_504:
                map.put("room", "教1－504");
                break;
            case R.id.building_1_5_505:
                map.put("room", "教1－505");
                break;
            case R.id.building_1_5_506:
                map.put("room", "教1－506");
                break;
            case R.id.building_1_5_507:
                map.put("room", "教1－507");
                break;
            case R.id.building_1_5_508:
                map.put("room", "教1－508");
                break;
            case R.id.building_1_5_509:
                map.put("room", "教1－509");
                break;
            case R.id.building_1_5_510:
                map.put("room", "教1－510");
                break;
        }

        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 15) {
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
