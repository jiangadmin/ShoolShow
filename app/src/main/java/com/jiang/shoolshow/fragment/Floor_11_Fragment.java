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
public class Floor_11_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_11_Fragment";

    TextView r_101, r_102, r_103, r_104, r_105, r_106, r_107, r_108, r_109, r_110;
    
    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_1_1, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_101 = view.findViewById(R.id.building_1_1_101);
        r_102 = view.findViewById(R.id.building_1_1_102);
        r_103 = view.findViewById(R.id.building_1_1_103);
        r_104 = view.findViewById(R.id.building_1_1_104);
        r_105 = view.findViewById(R.id.building_1_1_105);
        r_106 = view.findViewById(R.id.building_1_1_106);
        r_107 = view.findViewById(R.id.building_1_1_107);
        r_108 = view.findViewById(R.id.building_1_1_108);
        r_109 = view.findViewById(R.id.building_1_1_109);
        r_110 = view.findViewById(R.id.building_1_1_110);

        r_101.setOnClickListener(this);
        r_102.setOnClickListener(this);
        r_103.setOnClickListener(this);
        r_104.setOnClickListener(this);
        r_105.setOnClickListener(this);
        r_106.setOnClickListener(this);
        r_107.setOnClickListener(this);
        r_108.setOnClickListener(this);
        r_109.setOnClickListener(this);
        r_110.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教1－101", r_101);
        map.put("教1－102", r_102);
        map.put("教1－103", r_103);
        map.put("教1－104", r_104);
        map.put("教1－105", r_105);
        map.put("教1－106", r_106);
        map.put("教1－107", r_107);
        map.put("教1－108", r_108);
        map.put("教1－109", r_109);
        map.put("教1－110", r_110);

        AnimUtils.S(view.findViewById(R.id.floor_view), 0, Const.f_1_s);

    }

    @Override
    public void onClick(View v) {
        Map<String, String> map = new HashMap<>();
        map.put("floor", "1");
        switch (v.getId()) {
            case R.id.building_1_1_101:
                map.put("room", "教1－101");
                break;
            case R.id.building_1_1_102:
                map.put("room", "教1－102");
                break;
            case R.id.building_1_1_103:
                map.put("room", "教1－103");
                break;
            case R.id.building_1_1_104:
                map.put("room", "教1－104");
                break;
            case R.id.building_1_1_105:
                map.put("room", "教1－105");
                break;
            case R.id.building_1_1_106:
                map.put("room", "教1－106");
                break;
            case R.id.building_1_1_107:
                map.put("room", "教1－107");
                break;
            case R.id.building_1_1_108:
                map.put("room", "教1－108");
                break;
            case R.id.building_1_1_109:
                map.put("room", "教1－109");
                break;
            case R.id.building_1_1_110:
                map.put("room", "教1－110");
                break;
        }

        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 11) {
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
