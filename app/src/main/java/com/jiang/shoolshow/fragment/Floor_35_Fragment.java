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
public class Floor_35_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_11_Fragment";

    TextView r_506, r_507, r_508, r_509, r_510, r_511, r_512, r_513, r_515, r_520, r_526, r_527, r_528, r_537, r_538, r_539;

    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_3_5, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_506 = view.findViewById(R.id.building_3_5_506);
        r_507 = view.findViewById(R.id.building_3_5_507);
        r_508 = view.findViewById(R.id.building_3_5_508);
        r_509 = view.findViewById(R.id.building_3_5_509);
        r_510 = view.findViewById(R.id.building_3_5_510);
        r_511 = view.findViewById(R.id.building_3_5_511);
        r_512 = view.findViewById(R.id.building_3_5_512);
        r_513 = view.findViewById(R.id.building_3_5_513);
        r_515 = view.findViewById(R.id.building_3_5_515);
        r_520 = view.findViewById(R.id.building_3_5_520);
        r_526 = view.findViewById(R.id.building_3_5_526);
        r_527 = view.findViewById(R.id.building_3_5_527);
        r_528 = view.findViewById(R.id.building_3_5_528);
        r_537 = view.findViewById(R.id.building_3_5_537);
        r_538 = view.findViewById(R.id.building_3_5_538);
        r_539 = view.findViewById(R.id.building_3_5_539);

        r_506.setOnClickListener(this);
        r_507.setOnClickListener(this);
        r_508.setOnClickListener(this);
        r_509.setOnClickListener(this);
        r_510.setOnClickListener(this);
        r_511.setOnClickListener(this);
        r_512.setOnClickListener(this);
        r_513.setOnClickListener(this);
        r_515.setOnClickListener(this);
        r_520.setOnClickListener(this);
        r_526.setOnClickListener(this);
        r_527.setOnClickListener(this);
        r_528.setOnClickListener(this);
        r_537.setOnClickListener(this);
        r_538.setOnClickListener(this);
        r_539.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教3－506", r_506);
        map.put("教3－507", r_507);
        map.put("教3－508", r_508);
        map.put("教3－509", r_509);
        map.put("教3－510", r_510);
        map.put("教3－511", r_511);
        map.put("教3－512", r_512);
        map.put("教3－513", r_513);
        map.put("教3－515", r_515);
        map.put("教3－520", r_520);
        map.put("教3－526", r_526);
        map.put("教3－527", r_527);
        map.put("教3－528", r_528);
        map.put("教3－537", r_537);
        map.put("教3－538", r_538);
        map.put("教3－539", r_539);
    }

    @Override
    public void onClick(View v) {
        Map<String, String> map = new HashMap<>();
        map.put("floor", "5");
        switch (v.getId()) {
            case R.id.building_3_5_500:
                map.put("room", "教3－500");
                break;
            case R.id.building_3_5_501:
                map.put("room", "教3－501");
                break;
            case R.id.building_3_5_504:
                map.put("room", "教3－504");
                break;
            case R.id.building_3_5_506:
                map.put("room", "教3－506");
                break;
            case R.id.building_3_5_507:
                map.put("room", "教3－507");
                break;
            case R.id.building_3_5_508:
                map.put("room", "教3－508");
                break;
            case R.id.building_3_5_509:
                map.put("room", "教3－509");
                break;
            case R.id.building_3_5_510:
                map.put("room", "教3－510");
                break;
            case R.id.building_3_5_511:
                map.put("room", "教3－511");
                break;
            case R.id.building_3_5_512:
                map.put("room", "教3－512");
                break;
            case R.id.building_3_5_513:
                map.put("room", "教3－513");
                break;
            case R.id.building_3_5_515:
                map.put("room", "教3－515");
                break;
            case R.id.building_3_5_520:
                map.put("room", "教3－520");
                break;
            case R.id.building_3_5_526:
                map.put("room", "教3－526");
                break;
            case R.id.building_3_5_527:
                map.put("room", "教3－527");
                break;
            case R.id.building_3_5_528:
                map.put("room", "教3－528");
                break;
            case R.id.building_3_5_537:
                map.put("room", "教3－537");
                break;
            case R.id.building_3_5_538:
                map.put("room", "教3－538");
                break;
            case R.id.building_3_5_539:
                map.put("room", "教3－539");
                break;
        }

        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));

    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 35) {
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
