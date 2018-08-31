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
public class Floor_42_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_11_Fragment";

    TextView r_201, r_202, r_204, r_205, r_208, r_209, r_211;

    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_4_2, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_201 = view.findViewById(R.id.building_4_2_201);
        r_202 = view.findViewById(R.id.building_4_2_202);
        r_204 = view.findViewById(R.id.building_4_2_204);
        r_205 = view.findViewById(R.id.building_4_2_205);
        r_208 = view.findViewById(R.id.building_4_2_208);
        r_209 = view.findViewById(R.id.building_4_2_209);
        r_211 = view.findViewById(R.id.building_4_2_211);

        r_201.setOnClickListener(this);
        r_202.setOnClickListener(this);
        r_204.setOnClickListener(this);
        r_205.setOnClickListener(this);
        r_208.setOnClickListener(this);
        r_209.setOnClickListener(this);
        r_211.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教4－201", r_201);
        map.put("教4－202", r_202);
        map.put("教4－204", r_204);
        map.put("教4－205", r_205);
        map.put("教4－208", r_208);
        map.put("教4－209", r_209);
        map.put("教4－211", r_211);

    }

    @Override
    public void onClick(View v) {
        Map<String, String> map = new HashMap<>();
        map.put("floor", "2");
        switch (v.getId()) {
            case R.id.building_4_2_201:
                map.put("room", "教4－201");
                break;
            case R.id.building_4_2_202:
                map.put("room", "教4－202");
                break;
            case R.id.building_4_2_204:
                map.put("room", "教4－204");
                break;
            case R.id.building_4_2_205:
                map.put("room", "教4－205");
                break;
            case R.id.building_4_2_206:
                map.put("room", "教4－206");
                break;
            case R.id.building_4_2_208:
                map.put("room", "教4－208");
                break;
            case R.id.building_4_2_209:
                map.put("room", "教4－209");
                break;
            case R.id.building_4_2_211:
                map.put("room", "教4－211");
                break;
            case R.id.building_4_2_214:
                map.put("room", "教4－214");
                break;
            case R.id.building_4_2_225:
                map.put("room", "教4－225");
                break;

        }

        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));

    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 42) {
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
