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
public class Floor_21_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_21_Fragment";

    TextView r_100, r_101, r_102, r_103, r_104, r_105, r_106, r_113, r_114, r_115, r_116, r_117, r_118;

    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_2_1, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_100 = view.findViewById(R.id.building_2_1_100);
        r_101 = view.findViewById(R.id.building_2_1_101);
        r_102 = view.findViewById(R.id.building_2_1_102);
        r_103 = view.findViewById(R.id.building_2_1_103);
        r_104 = view.findViewById(R.id.building_2_1_104);
        r_105 = view.findViewById(R.id.building_2_1_105);
        r_106 = view.findViewById(R.id.building_2_1_106);
        r_113 = view.findViewById(R.id.building_2_1_113);
        r_114 = view.findViewById(R.id.building_2_1_114);
        r_115 = view.findViewById(R.id.building_2_1_115);
        r_116 = view.findViewById(R.id.building_2_1_116);
        r_117 = view.findViewById(R.id.building_2_1_117);
        r_118 = view.findViewById(R.id.building_2_1_118);

        r_100.setOnClickListener(this);
        r_101.setOnClickListener(this);
        r_102.setOnClickListener(this);
        r_103.setOnClickListener(this);
        r_104.setOnClickListener(this);
        r_105.setOnClickListener(this);
        r_106.setOnClickListener(this);
        r_113.setOnClickListener(this);
        r_114.setOnClickListener(this);
        r_115.setOnClickListener(this);
        r_116.setOnClickListener(this);
        r_117.setOnClickListener(this);
        r_118.setOnClickListener(this);

        map = new HashMap<>();
        map.put("教2－100", r_100);
        map.put("教2－101", r_101);
        map.put("教2－102", r_102);
        map.put("教2－103", r_103);
        map.put("教2－104", r_104);
        map.put("教2－105", r_105);
        map.put("教2－106", r_106);
        map.put("教2－113", r_113);
        map.put("教2－114", r_114);
        map.put("教2－115", r_115);
        map.put("教2－116", r_116);
        map.put("教2－117", r_117);
        map.put("教2－118", r_118);

    }

    @Override
    public void onClick(View v) {
        Map<String,String> map = new HashMap<>();
        map.put("floor", "1");
        switch (v.getId()) {

            case R.id.building_2_1_100:
                map.put("room", "教2－100");
                break;
            case R.id.building_2_1_101:
                map.put("room", "教2－101");
                break;
            case R.id.building_2_1_102:
                map.put("room", "教2－102");
                break;
            case R.id.building_2_1_103:
                map.put("room", "教2－103");
                break;
            case R.id.building_2_1_104:
                map.put("room", "教2－104");
                break;
            case R.id.building_2_1_105:
                map.put("room", "教2－105");
                break;
            case R.id.building_2_1_106:
                map.put("room", "教2－106");
                break;
            case R.id.building_2_1_113:
                map.put("room", "教2－113");
                break;
            case R.id.building_2_1_114:
                map.put("room", "教2－114");
                break;
            case R.id.building_2_1_115:
                map.put("room", "教2－115");
                break;
            case R.id.building_2_1_116:
                map.put("room", "教2－116");
                break;
            case R.id.building_2_1_117:
                map.put("room", "教2－117");
                break;
            case R.id.building_2_1_118:
                map.put("room", "教2－118");
                break;

        }

        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 21) {
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
