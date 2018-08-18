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
public class Floor_43_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_11_Fragment";

    TextView r_300, r_301, r_302, r_304, r_306, r_308, r_309, r_311, r_312, r_313, r_314, r_315, r_316, r_325, r_326, r_327;

    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_4_3, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_300 = view.findViewById(R.id.building_4_3_300);
        r_301 = view.findViewById(R.id.building_4_3_301);
        r_302 = view.findViewById(R.id.building_4_3_302);
        r_304 = view.findViewById(R.id.building_4_3_304);
        r_306 = view.findViewById(R.id.building_4_3_306);
        r_308 = view.findViewById(R.id.building_4_3_308);
        r_309 = view.findViewById(R.id.building_4_3_309);
        r_311 = view.findViewById(R.id.building_4_3_311);
        r_312 = view.findViewById(R.id.building_4_3_312);
        r_313 = view.findViewById(R.id.building_4_3_313);
        r_314 = view.findViewById(R.id.building_4_3_314);
        r_315 = view.findViewById(R.id.building_4_3_315);
        r_316 = view.findViewById(R.id.building_4_3_316);
        r_325 = view.findViewById(R.id.building_4_3_325);
        r_326 = view.findViewById(R.id.building_4_3_326);
        r_327 = view.findViewById(R.id.building_4_3_327);

        r_300.setOnClickListener(this);
        r_301.setOnClickListener(this);
        r_302.setOnClickListener(this);
        r_304.setOnClickListener(this);
        r_306.setOnClickListener(this);
        r_308.setOnClickListener(this);
        r_309.setOnClickListener(this);
        r_311.setOnClickListener(this);
        r_312.setOnClickListener(this);
        r_313.setOnClickListener(this);
        r_314.setOnClickListener(this);
        r_315.setOnClickListener(this);
        r_316.setOnClickListener(this);
        r_325.setOnClickListener(this);
        r_326.setOnClickListener(this);
        r_327.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教4－300", r_300);
        map.put("教4－301", r_301);
        map.put("教4－302", r_302);
        map.put("教4－304", r_304);
        map.put("教4－306", r_306);
        map.put("教4－308", r_308);
        map.put("教4－309", r_309);
        map.put("教4－311", r_311);
        map.put("教4－312", r_312);
        map.put("教4－313", r_313);
        map.put("教4－314", r_314);
        map.put("教4－315", r_315);
        map.put("教4－316", r_316);
        map.put("教4－325", r_325);
        map.put("教4－326", r_326);
        map.put("教4－327", r_327);
    }

    @Override
    public void onClick(View v) {
        Map<String,String> map = new HashMap<>();
        map.put("floor", "3");
        switch (v.getId()) {
            case R.id.building_4_3_300:
                map.put("room", "教4－300");
                break;
            case R.id.building_4_3_301:
                map.put("room", "教4－301");
                break;
            case R.id.building_4_3_302:
                map.put("room", "教4－302");
                break;
            case R.id.building_4_3_304:
                map.put("room", "教4－304");
                break;
            case R.id.building_4_3_306:
                map.put("room", "教4－306");
                break;
            case R.id.building_4_3_308:
                map.put("room", "教4－308");
                break;
            case R.id.building_4_3_309:
                map.put("room", "教4－309");
                break;
            case R.id.building_4_3_311:
                map.put("room", "教4－311");
                break;
            case R.id.building_4_3_312:
                map.put("room", "教4－312");
                break;
            case R.id.building_4_3_313:
                map.put("room", "教4－313");
                break;
            case R.id.building_4_3_314:
                map.put("room", "教4－314");
                break;
            case R.id.building_4_3_315:
                map.put("room", "教4－315");
                break;
            case R.id.building_4_3_316:
                map.put("room", "教4－316");
                break;
            case R.id.building_4_3_325:
                map.put("room", "教4－325");
                break;
            case R.id.building_4_3_326:
                map.put("room", "教4－326");
                break;
            case R.id.building_4_3_327:
                map.put("room", "教4－327");
                break;
        }
        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 43) {
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
