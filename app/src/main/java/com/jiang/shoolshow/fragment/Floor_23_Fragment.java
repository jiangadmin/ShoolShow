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
public class Floor_23_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_11_Fragment";

    TextView r_300,
            r_301,
            r_302,
            r_303,
            r_304,
            r_305,
            r_308,
            r_309,
            r_311,
            r_312,
            r_313,
            r_315,
            r_316;

    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_2_3, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_300 = view.findViewById(R.id.building_2_3_300);
        r_301 = view.findViewById(R.id.building_2_3_301);
        r_302 = view.findViewById(R.id.building_2_3_302);
        r_303 = view.findViewById(R.id.building_2_3_303);
        r_304 = view.findViewById(R.id.building_2_3_304);
        r_305 = view.findViewById(R.id.building_2_3_305);
        r_308 = view.findViewById(R.id.building_2_3_308);
        r_309 = view.findViewById(R.id.building_2_3_309);
        r_311 = view.findViewById(R.id.building_2_3_311);
        r_312 = view.findViewById(R.id.building_2_3_312);
        r_313 = view.findViewById(R.id.building_2_3_313);
        r_315 = view.findViewById(R.id.building_2_3_315);
        r_316 = view.findViewById(R.id.building_2_3_316);

        map = new HashMap();

        map.put("教2－300", r_300);
        map.put("教2－301", r_301);
        map.put("教2－302", r_302);
        map.put("教2－303", r_303);
        map.put("教2－304", r_304);
        map.put("教2－305", r_305);
        map.put("教2－308", r_308);
        map.put("教2－309", r_309);
        map.put("教2－311", r_311);
        map.put("教2－312", r_312);
        map.put("教2－313", r_313);
        map.put("教2－315", r_315);
        map.put("教2－316", r_316);

    }

    @Override
    public void onClick(View v) {
        Map map = new HashMap();
        map.put("floor", 3);
        switch (v.getId()) {
            case R.id.building_2_3_300:
                map.put("room", "教2－300");
                break;
            case R.id.building_2_3_301:
                map.put("room", "教2－301");
                break;
            case R.id.building_2_3_302:
                map.put("room", "教2－302");
                break;
            case R.id.building_2_3_303:
                map.put("room", "教2－303");
                break;
            case R.id.building_2_3_304:
                map.put("room", "教2－304");
                break;
            case R.id.building_2_3_305:
                map.put("room", "教2－305");
                break;
            case R.id.building_2_3_308:
                map.put("room", "教2－308");
                break;
            case R.id.building_2_3_309:
                map.put("room", "教2－309");
                break;
            case R.id.building_2_3_311:
                map.put("room", "教2－311");
                break;
            case R.id.building_2_3_312:
                map.put("room", "教2－312");
                break;
            case R.id.building_2_3_313:
                map.put("room", "教2－313");
                break;
            case R.id.building_2_3_315:
                map.put("room", "教2－315");
                break;
            case R.id.building_2_3_316:
                map.put("room", "教2－316");
                break;

        }
        EventBus.getDefault().post(map);
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 23) {
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
