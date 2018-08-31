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
public class Floor_13_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_13_Fragment";

    TextView r_300, r_301, r_302, r_303;
    
    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_1_3, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_300 = view.findViewById(R.id.building_1_3_300);
        r_301 = view.findViewById(R.id.building_1_3_301);
        r_302 = view.findViewById(R.id.building_1_3_302);
        r_303 = view.findViewById(R.id.building_1_3_303);

        r_300.setOnClickListener(this);
        r_301.setOnClickListener(this);
        r_302.setOnClickListener(this);
        r_303.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教1－300", r_300);
        map.put("教1－301", r_301);
        map.put("教1－302", r_302);
        map.put("教1－303", r_303);

        AnimUtils.S(view.findViewById(R.id.floor_view), 0, Const.f_1_s);
    }

    @Override
    public void onClick(View v) {
        Map<String,String> map = new HashMap<>();
        map.put("floor", "3");
        switch (v.getId()) {
            case R.id.building_1_3_300:
                map.put("room", "教1－300");
                break;
            case R.id.building_1_3_301:
                map.put("room", "教1－301");
                break;
            case R.id.building_1_3_302:
                map.put("room", "教1－302");
                break;
            case R.id.building_1_3_303:
                map.put("room", "教1－303");
                break;
            case R.id.building_1_3_308:
                map.put("room", "教1－308");
                break;
        }

        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 13) {
            for (Floor_Entity.ResultBean.SkjsInfoListBean bean : entity.getResult().getSkjsInfoList()) {
                LogUtil.e(TAG, "接收到"+bean.getSkdd());
                if (map.get(bean.getSkdd()) != null) {
                    map.get(bean.getSkdd()).setBackgroundResource(R.drawable.kuang_red);
                    LogUtil.e(TAG, "变色");
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
