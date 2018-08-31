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
public class Floor_22_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_11_Fragment";

    TextView r_201, r_202, r_203, r_204, r_205, r_208, r_209, r_211, r_212, r_213, r_214_1, r_215_1, r_216_1, r_225_1, r_226_1, r_227_1, r_214_2, r_215_2, r_216_2, r_225_2, r_226_2, r_227_2;

    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_2_2, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_201 = view.findViewById(R.id.building_2_2_201);
        r_202 = view.findViewById(R.id.building_2_2_202);
        r_203 = view.findViewById(R.id.building_2_2_203);
        r_204 = view.findViewById(R.id.building_2_2_204);
        r_205 = view.findViewById(R.id.building_2_2_205);
        r_208 = view.findViewById(R.id.building_2_2_208);
        r_209 = view.findViewById(R.id.building_2_2_209);
        r_211 = view.findViewById(R.id.building_2_2_211);
        r_212 = view.findViewById(R.id.building_2_2_212);
        r_213 = view.findViewById(R.id.building_2_2_213);
        r_214_1 = view.findViewById(R.id.building_2_2_214_1);
        r_215_1 = view.findViewById(R.id.building_2_2_215_1);
        r_216_1 = view.findViewById(R.id.building_2_2_216_1);
        r_225_1 = view.findViewById(R.id.building_2_2_225_1);
        r_226_1 = view.findViewById(R.id.building_2_2_226_1);
        r_227_1 = view.findViewById(R.id.building_2_2_227_1);
        r_214_2 = view.findViewById(R.id.building_2_2_214_2);
        r_215_2 = view.findViewById(R.id.building_2_2_215_2);
        r_216_2 = view.findViewById(R.id.building_2_2_216_2);
        r_225_2 = view.findViewById(R.id.building_2_2_225_2);
        r_226_2 = view.findViewById(R.id.building_2_2_226_2);
        r_227_2 = view.findViewById(R.id.building_2_2_227_2);

        r_201.setOnClickListener(this);
        r_202.setOnClickListener(this);
        r_203.setOnClickListener(this);
        r_204.setOnClickListener(this);
        r_205.setOnClickListener(this);
        r_208.setOnClickListener(this);
        r_209.setOnClickListener(this);
        r_211.setOnClickListener(this);
        r_212.setOnClickListener(this);
        r_213.setOnClickListener(this);
        r_214_1.setOnClickListener(this);
        r_215_1.setOnClickListener(this);
        r_216_1.setOnClickListener(this);
        r_225_1.setOnClickListener(this);
        r_226_1.setOnClickListener(this);
        r_227_1.setOnClickListener(this);
        r_214_2.setOnClickListener(this);
        r_215_2.setOnClickListener(this);
        r_216_2.setOnClickListener(this);
        r_225_2.setOnClickListener(this);
        r_226_2.setOnClickListener(this);
        r_227_2.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教2－201", r_201);
        map.put("教2－202", r_202);
        map.put("教2－203", r_203);
        map.put("教2－204", r_204);
        map.put("教2－205", r_205);
        map.put("教2－208", r_208);
        map.put("教2－209", r_209);
        map.put("教2－211", r_211);
        map.put("教2－212", r_212);
        map.put("教2－213", r_213);
        map.put("教2－214(1)", r_214_1);
        map.put("教2－215(1)", r_215_1);
        map.put("教2－216(1)", r_216_1);
        map.put("教2－225(1)", r_225_1);
        map.put("教2－226(1)", r_226_1);
        map.put("教2－227(1)", r_227_1);
        map.put("教2－214(2)", r_214_2);
        map.put("教2－215(2)", r_215_2);
        map.put("教2－216(2)", r_216_2);
        map.put("教2－225(2)", r_225_2);
        map.put("教2－226(2)", r_226_2);
        map.put("教2－227(2)", r_227_2);

    }

    @Override
    public void onClick(View v) {
        Map<String, String> map = new HashMap<>();
        map.put("floor", "2");
        switch (v.getId()) {
            case R.id.building_2_2_201:
                map.put("room", "教2－201");
                break;
            case R.id.building_2_2_202:
                map.put("room", "教2－202");
                break;
            case R.id.building_2_2_203:
                map.put("room", "教2－203");
                break;
            case R.id.building_2_2_204:
                map.put("room", "教2－204");
                break;
            case R.id.building_2_2_205:
                map.put("room", "教2－205");
                break;
            case R.id.building_2_2_208:
                map.put("room", "教2－208");
                break;
            case R.id.building_2_2_209:
                map.put("room", "教2－209");
                break;
            case R.id.building_2_2_211:
                map.put("room", "教2－211");
                break;
            case R.id.building_2_2_212:
                map.put("room", "教2－212");
                break;
            case R.id.building_2_2_213:
                map.put("room", "教2－213");
                break;
            case R.id.building_2_2_214_1:
                map.put("room", "教2－214(1)");
                break;
            case R.id.building_2_2_214_2:
                map.put("room", "教2－214");
                break;
            case R.id.building_2_2_215_1:
                map.put("room", "教2－215(1)");
                break;
            case R.id.building_2_2_215_2:
                map.put("room", "教2－215(2)");
                break;
            case R.id.building_2_2_216_1:
                map.put("room", "教2－216(1)");
                break;
            case R.id.building_2_2_216_2:
                map.put("room", "教2－216(2)");
                break;
            case R.id.building_2_2_225_1:
                map.put("room", "教2－225(1)");
                break;
            case R.id.building_2_2_225_2:
                map.put("room", "教2－225(2)");
                break;
            case R.id.building_2_2_226_1:
                map.put("room", "教2－226(1)");
                break;
            case R.id.building_2_2_226_2:
                map.put("room", "教2－226(2)");
                break;
            case R.id.building_2_2_227_1:
                map.put("room", "教2－227(1)");
                break;
            case R.id.building_2_2_227_2:
                map.put("room", "教2－227(2)");
                break;
        }
        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));

    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 22) {
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
