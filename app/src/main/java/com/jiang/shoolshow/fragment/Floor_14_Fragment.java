package com.jiang.shoolshow.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jiang.shoolshow.R;
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
public class Floor_14_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_14_Fragment";

    TextView b_401, b_402, b_403, b_406, b_407, b_408, b_400;

    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_1_4, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        b_400 = view.findViewById(R.id.building_1_4_400);
        b_401 = view.findViewById(R.id.building_1_4_401);
        b_402 = view.findViewById(R.id.building_1_4_402);
        b_403 = view.findViewById(R.id.building_1_4_403);
        b_406 = view.findViewById(R.id.building_1_4_406);
        b_407 = view.findViewById(R.id.building_1_4_407);
        b_408 = view.findViewById(R.id.building_1_4_408);

        map = new HashMap();

        map.put("教1-400", b_400);
        map.put("教1-401", b_401);
        map.put("教1-402", b_402);
        map.put("教1-403", b_403);
        map.put("教1-406", b_406);
        map.put("教1-407", b_407);
        map.put("教1-408", b_408);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.building_1_4_400:
                break;
            case R.id.building_1_4_401:
                break;
            case R.id.building_1_4_402:
                break;
            case R.id.building_1_4_403:
                break;
            case R.id.building_1_4_404:
                break;
            case R.id.building_1_4_405:
                break;
            case R.id.building_1_4_406:
                break;
            case R.id.building_1_4_407:
                break;
            case R.id.building_1_4_408:
                break;

        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 14) {
            for (Floor_Entity.ResultBean.SkjsInfoListBean bean : entity.getResult().getSkjsInfoList()) {
                if (map.get(bean.getSkdd()) != null) {
                    map.get(bean.getSkdd()).setBackgroundResource(R.drawable.kuang_red);
                    map.get(bean.getSkdd()).setOnClickListener(this);
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
