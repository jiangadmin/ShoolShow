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
public class Floor_31_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_11_Fragment";

    TextView r_101,
            r_102,
            r_103,
            r_104,
            r_105,
            r_106,
            r_107,
            r_108,
            r_109,
            r_116,
            r_117,
            r_118;

    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_3_1, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        r_101 = view.findViewById(R.id.building_3_1_101);
        r_102 = view.findViewById(R.id.building_3_1_102);
        r_103 = view.findViewById(R.id.building_3_1_103);
        r_104 = view.findViewById(R.id.building_3_1_104);
        r_105 = view.findViewById(R.id.building_3_1_105);
        r_106 = view.findViewById(R.id.building_3_1_106);
        r_107 = view.findViewById(R.id.building_3_1_107);
        r_108 = view.findViewById(R.id.building_3_1_108);
        r_109 = view.findViewById(R.id.building_3_1_109);
        r_116 = view.findViewById(R.id.building_3_1_116);
        r_117 = view.findViewById(R.id.building_3_1_117);
        r_118 = view.findViewById(R.id.building_3_1_118);


        map = new HashMap();

        map.put("教3－101", r_101);
        map.put("教3－102", r_102);
        map.put("教3－103", r_103);
        map.put("教3－104", r_104);
        map.put("教3－105", r_105);
        map.put("教3－106", r_106);
        map.put("教3－107", r_107);
        map.put("教3－108", r_108);
        map.put("教3－109", r_109);
        map.put("教3－116", r_116);
        map.put("教3－117", r_117);
        map.put("教3－118", r_118);


    }

    @Override
    public void onClick(View v) {
        Map map = new HashMap();
        map.put("floor", 1);
        switch (v.getId()) {
            case R.id.building_3_1_101:
                map.put("room", "教3－101");
                break;
            case R.id.building_3_1_102:
                map.put("room", "教3－102");
                break;
            case R.id.building_3_1_103:
                map.put("room", "教3－103");
                break;
            case R.id.building_3_1_104:
                map.put("room", "教3－104");
                break;
            case R.id.building_3_1_105:
                map.put("room", "教3－105");
                break;
            case R.id.building_3_1_106:
                map.put("room", "教3－106");
                break;
            case R.id.building_3_1_107:
                map.put("room", "教3－107");
                break;
            case R.id.building_3_1_108:
                map.put("room", "教3－108");
                break;
            case R.id.building_3_1_109:
                map.put("room", "教3－109");
                break;
            case R.id.building_3_1_116:
                map.put("room", "教3－116");
                break;
            case R.id.building_3_1_117:
                map.put("room", "教3－117");
                break;
            case R.id.building_3_1_118:
                map.put("room", "教3－118");
                break;

        }
        EventBus.getDefault().post(map);
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 31) {
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
