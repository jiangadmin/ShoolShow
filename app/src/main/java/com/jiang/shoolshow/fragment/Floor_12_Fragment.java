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
public class Floor_12_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_12_Fragment";

    TextView b_201, b_202, b_203, b_206, b_207;

    Map<String, TextView> map;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_1_2, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        b_201 = view.findViewById(R.id.building_1_2_201);
        b_202 = view.findViewById(R.id.building_1_2_202);
        b_203 = view.findViewById(R.id.building_1_2_203);
        b_206 = view.findViewById(R.id.building_1_2_206);
        b_207 = view.findViewById(R.id.building_1_2_207);

        b_201.setOnClickListener(this);
        b_202.setOnClickListener(this);
        b_203.setOnClickListener(this);
        b_206.setOnClickListener(this);
        b_207.setOnClickListener(this);

        map = new HashMap<>();

        map.put("教1－201", b_201);
        map.put("教1－202", b_202);
        map.put("教1－203", b_203);
        map.put("教1－206", b_206);
        map.put("教1－207", b_207);

        AnimUtils.S(view.findViewById(R.id.floor_view), 0, Const.f_1_s);

    }

    @Override
    public void onClick(View v) {
        Map<String,String> map = new HashMap<>();
        map.put("floor", "2");
        switch (v.getId()) {
            case R.id.building_1_2_201:
                map.put("room", "教1－201");
                break;
            case R.id.building_1_2_202:
                map.put("room", "教1－202");
                break;
            case R.id.building_1_2_203:
                map.put("room", "教1－203");
                break;
            case R.id.building_1_2_206:
                map.put("room", "教1－206");
                break;
            case R.id.building_1_2_207:
                map.put("room", "教1－207");
                break;

        }

        ClassRoom_Acivity.start(getActivity(), map.get("floor"), map.get("room"));
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Floor_Entity entity) {
        LogUtil.e(TAG, "接收到");
        if (entity != null && entity.getFloor() == 12) {
            for (Floor_Entity.ResultBean.SkjsInfoListBean bean : entity.getResult().getSkjsInfoList()) {
                if (map.get(bean.getSkdd()) != null) {
                    map.get(bean.getSkdd()).setBackgroundResource(R.drawable.kuang_red);
                }
                map.get(bean.getSkdd()).setOnClickListener(this);
            }
        }
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }
}
