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
public class Floor_13_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_13_Fragment";

    TextView b_301, b_302, b_303, b_308, b_300;

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

        b_301 = view.findViewById(R.id.building_1_3_301);
        b_302 = view.findViewById(R.id.building_1_3_302);
        b_303 = view.findViewById(R.id.building_1_3_303);
        b_308 = view.findViewById(R.id.building_1_3_308);

        map = new HashMap();

        map.put("教1-300", b_300);
        map.put("教1-301", b_301);
        map.put("教1-302", b_302);
        map.put("教1-303", b_303);
        map.put("教1-308", b_308);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.building_1_3_300:
                break;
            case R.id.building_1_3_301:
                break;
            case R.id.building_1_3_302:
                break;
            case R.id.building_1_3_303:
                break;
            case R.id.building_1_3_304:
                break;
            case R.id.building_1_3_305:
                break;
            case R.id.building_1_3_306:
                break;
            case R.id.building_1_3_307:
                break;
            case R.id.building_1_3_308:
                break;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 13) {
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
