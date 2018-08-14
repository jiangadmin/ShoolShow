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
public class Floor_22_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_11_Fragment";

    TextView r_201,
            r_202,
            r_203,
            r_204,
            r_205,
            r_208,
            r_209,
            r_211,
            r_212,
            r_213,
            r_214,
            r_215,
            r_216,
            r_225,
            r_226,
            r_227;

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
        r_214 = view.findViewById(R.id.building_2_2_214);
        r_215 = view.findViewById(R.id.building_2_2_215);
        r_216 = view.findViewById(R.id.building_2_2_216);
        r_225 = view.findViewById(R.id.building_2_2_225);
        r_226 = view.findViewById(R.id.building_2_2_226);
        r_227 = view.findViewById(R.id.building_2_2_227);

        map = new HashMap();

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
        map.put("教2－214", r_214);
        map.put("教2－215", r_215);
        map.put("教2－216", r_216);
        map.put("教2－225", r_225);
        map.put("教2－226", r_226);
        map.put("教2－227", r_227);

    }

    @Override
    public void onClick(View v) {
        Map map = new HashMap();
        map.put("floor", 2);
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
            case R.id.building_2_2_214:
                map.put("room", "教2－214");
                break;
            case R.id.building_2_2_215:
                map.put("room", "教2－215");
                break;
            case R.id.building_2_2_216:
                map.put("room", "教2－216");
                break;
            case R.id.building_2_2_225:
                map.put("room", "教2－225");
                break;
            case R.id.building_2_2_226:
                map.put("room", "教2－226");
                break;
            case R.id.building_2_2_227:
                map.put("room", "教2－227");
                break;
        }
        EventBus.getDefault().post(map);
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 22) {
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
