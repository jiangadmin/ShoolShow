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
public class Floor_25_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_11_Fragment";

    TextView r_506, r_507, r_508, r_509, r_510, r_512, r_516, r_518, r_519, r_520;
    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_2_5, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_506 = view.findViewById(R.id.building_2_5_506);
        r_507 = view.findViewById(R.id.building_2_5_507);
        r_508 = view.findViewById(R.id.building_2_5_508);
        r_509 = view.findViewById(R.id.building_2_5_509);
        r_510 = view.findViewById(R.id.building_2_5_510);
        r_512 = view.findViewById(R.id.building_2_5_512);
        r_516 = view.findViewById(R.id.building_2_5_516);
        r_518 = view.findViewById(R.id.building_2_5_518);
        r_519 = view.findViewById(R.id.building_2_5_519);
        r_520 = view.findViewById(R.id.building_2_5_520);

        r_506.setOnClickListener(this);
        r_507.setOnClickListener(this);
        r_508.setOnClickListener(this);
        r_509.setOnClickListener(this);
        r_510.setOnClickListener(this);
        r_512.setOnClickListener(this);
        r_516.setOnClickListener(this);
        r_518.setOnClickListener(this);
        r_519.setOnClickListener(this);
        r_520.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教2－506", r_506);
        map.put("教2－507", r_507);
        map.put("教2－508", r_508);
        map.put("教2－509", r_509);
        map.put("教2－510", r_510);
        map.put("教2－512", r_512);
        map.put("教2－516", r_516);
        map.put("教2－518", r_518);
        map.put("教2－519", r_519);
        map.put("教2－520", r_520);

    }

    @Override
    public void onClick(View v) {
        Map<String, String> map = new HashMap<>();
        map.put("floor", "5");
        switch (v.getId()) {
            case R.id.building_2_5_506:
                map.put("room", "教2－506");
                break;
            case R.id.building_2_5_507:
                map.put("room", "教2－507");
                break;
            case R.id.building_2_5_508:
                map.put("room", "教2－508");
                break;
            case R.id.building_2_5_509:
                map.put("room", "教2－509");
                break;
            case R.id.building_2_5_510:
                map.put("room", "教2－510");
                break;
            case R.id.building_2_5_512:
                map.put("room", "教2－512");
                break;
            case R.id.building_2_5_516:
                map.put("room", "教2－516");
                break;
            case R.id.building_2_5_518:
                map.put("room", "教2－518");
                break;
            case R.id.building_2_5_519:
                map.put("room", "教2－519");
                break;
            case R.id.building_2_5_520:
                map.put("room", "教2－520");
                break;

        }

        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 25) {
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
