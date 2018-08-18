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

    TextView b_501, b_502, b_503, b_504, b_505, b_506, b_507, b_508, b_509, b_510;

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

        b_501 = view.findViewById(R.id.building_1_5_501);
        b_502 = view.findViewById(R.id.building_1_5_502);
        b_503 = view.findViewById(R.id.building_1_5_503);
        b_504 = view.findViewById(R.id.building_1_5_504);
        b_505 = view.findViewById(R.id.building_1_5_505);
        b_506 = view.findViewById(R.id.building_1_5_506);
        b_507 = view.findViewById(R.id.building_1_5_507);
        b_508 = view.findViewById(R.id.building_1_5_508);
        b_509 = view.findViewById(R.id.building_1_5_509);
        b_510 = view.findViewById(R.id.building_1_5_510);

        b_501.setOnClickListener(this);
        b_502.setOnClickListener(this);
        b_503.setOnClickListener(this);
        b_504.setOnClickListener(this);
        b_505.setOnClickListener(this);
        b_506.setOnClickListener(this);
        b_507.setOnClickListener(this);
        b_508.setOnClickListener(this);
        b_509.setOnClickListener(this);
        b_510.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教1－501", b_501);
        map.put("教1－502", b_502);
        map.put("教1－503", b_503);
        map.put("教1－504", b_504);
        map.put("教1－505", b_505);
        map.put("教1－506", b_506);
        map.put("教1－507", b_507);
        map.put("教1－508", b_508);
        map.put("教1－509", b_509);
        map.put("教1－510", b_510);

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
