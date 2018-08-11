package com.jiang.shoolshow.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.activity.MainActivity;
import com.jiang.shoolshow.entity.Building_Entity;
import com.jiang.shoolshow.entity.Const;
import com.jiang.shoolshow.servlet.Get_Floor_Info;
import com.jiang.shoolshow.utils.AnimUtils;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: jiangadmin
 * @date: 2018/7/20
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 教学楼3
 */
public class Building_03_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Building_03_Fragment";

    View floor_1, floor_2, floor_3, floor_4, floor_5;

    List<View> floor = new ArrayList<>();

    int rx = 65, r = 0;

    float s = 0.7F;

    int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0;

    int top = -1080;
    int bottom = 1080;

    /**
     * -1 在上 0 显示 1 在下
     */
    int fg1 = 0, fg2 = 0, fg3 = 0, fg4 = 0, fg5 = 0;

    TextView r_101, r_102, r_103, r_104, r_105, r_106, r_107, r_108, r_109, r_116, r_117, r_118,
            r_201, r_202, r_203, r_204, r_205, r_208, r_209, r_210, r_212, r_213, r_214, r_215, r_216, r_225, r_226, r_227,
            r_300, r_301, r_302, r_303, r_304, r_305, r_308, r_309, r_310, r_312, r_313, r_314, r_315, r_316, r_322, r_323, r_324,
            r_400, r_401, r_402, r_403, r_404, r_405, r_408, r_409, r_410, r_412, r_413, r_416, r_417, r_418, r_426, r_427, r_428,
            r_500,r_501, r_504, r_506, r_507, r_508, r_509, r_510, r_511, r_512, r_513, r_515, r_520, r_526, r_527, r_528, r_537, r_538, r_539,
            r_601,r_602,r_603,r_606,r_611;

    Map<String,TextView> map = new HashMap();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_3, container, false);
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        floor_1 = view.findViewById(R.id.building_3_1);
        floor_2 = view.findViewById(R.id.building_3_2);
        floor_3 = view.findViewById(R.id.building_3_3);
        floor_4 = view.findViewById(R.id.building_3_4);
        floor_5 = view.findViewById(R.id.building_3_5);

        //一楼
        r_101 = view.findViewById(R.id.building_3_1_101);
        r_102 = view.findViewById(R.id.building_3_1_102);
        r_103 = view.findViewById(R.id.building_3_1_103);
        r_104 = view.findViewById(R.id.building_3_1_104);
        r_105 = view.findViewById(R.id.building_3_1_105);
        r_106 = view.findViewById(R.id.building_3_1_106);
        r_107 = view.findViewById(R.id.building_3_1_107);
        r_108 = view.findViewById(R.id.building_3_1_108);
        r_109 = view.findViewById(R.id.building_3_1_109);


        //二楼
        r_201 = view.findViewById(R.id.building_3_2_201);
        r_202 = view.findViewById(R.id.building_3_2_202);
        r_203 = view.findViewById(R.id.building_3_2_203);


        //三楼
        r_300 = view.findViewById(R.id.building_3_3_300);
        r_301 = view.findViewById(R.id.building_3_3_301);
        r_302 = view.findViewById(R.id.building_3_3_302);
        r_303 = view.findViewById(R.id.building_3_3_303);
        r_308 = view.findViewById(R.id.building_3_3_308);

        //四楼
        r_400 = view.findViewById(R.id.building_3_4_400);
        r_401 = view.findViewById(R.id.building_3_4_401);
        r_402 = view.findViewById(R.id.building_3_4_402);
        r_403 = view.findViewById(R.id.building_3_4_403);
        r_408 = view.findViewById(R.id.building_3_4_408);

        //五楼
        r_501 = view.findViewById(R.id.building_3_5_501);
        r_506 = view.findViewById(R.id.building_3_5_506);
        r_507 = view.findViewById(R.id.building_3_5_507);
        r_508 = view.findViewById(R.id.building_3_5_508);
        r_509 = view.findViewById(R.id.building_3_5_509);
        r_510 = view.findViewById(R.id.building_3_5_510);

        floor_1.setOnClickListener(this);
        floor_2.setOnClickListener(this);
        floor_3.setOnClickListener(this);
        floor_4.setOnClickListener(this);
        floor_5.setOnClickListener(this);

        floor.add(floor_1);
        floor.add(floor_2);
        floor.add(floor_3);
        floor.add(floor_4);
        floor.add(floor_5);

        map.put("教3－101", r_101);
        map.put("教3－102", r_102);
        map.put("教3－103", r_103);
        map.put("教3－104", r_104);
        map.put("教3－105", r_105);
        map.put("教3－106", r_106);
        map.put("教3－107", r_107);
        map.put("教3－108", r_108);
        map.put("教3－109", r_109);

        map.put("教3－201", r_201);
        map.put("教3－202", r_202);
        map.put("教3－203", r_203);

        map.put("教3－300", r_300);
        map.put("教3－301", r_301);
        map.put("教3－302", r_302);
        map.put("教3－303", r_303);
        map.put("教3－308", r_308);

        map.put("教3－400", r_400);
        map.put("教3－401", r_401);
        map.put("教3－402", r_402);
        map.put("教3－403", r_403);
        map.put("教3－408", r_408);

        map.put("教3－501", r_501);
        map.put("教3－504", r_504);
        map.put("教3－506", r_506);
        map.put("教3－507", r_507);
        map.put("教3－508", r_508);
        map.put("教3－509", r_509);
        map.put("教3－510", r_510);

        FW();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.building_3_1:
                ZK(31);
                break;
            case R.id.building_3_2:
                ZK(32);
                break;
            case R.id.building_3_3:
                ZK(33);
                break;
            case R.id.building_3_4:
                ZK(34);
                break;
            case R.id.building_3_5:
                ZK(35);
                break;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Building_Entity.ResultBean bean) {
        if (bean.getBuildCode() == 1) {
            for (Building_Entity.ResultBean.SkjsInfoListBean listBean : bean.getSkjsInfoList()) {
                if (map.get(listBean.getSkdd())!=null){
                    map.get(listBean.getSkdd()).setBackgroundResource(R.drawable.kuang_red);
                }
            }
        }
    }

    /**
     * 其他布局走开
     *
     * @param i
     */
    public void ZK(int i) {

        new Get_Floor_Info(getActivity(),i).execute(Const.IP, String.valueOf(i % 10));

//        Map map = new HashMap();
//        map.put("floor", 2);
//        map.put("room", i);
//        EventBus.getDefault().post(map);

    }

    /**
     * 初始化  复位
     */
    public void FW() {

        if (floor_1.getVisibility() == View.GONE) {
            AnimUtils.Y(floor_1, bottom, 0);
            floor_1.setVisibility(View.VISIBLE);
        }

        if (floor_2.getVisibility() == View.GONE) {
            if (fg2 == -1) {
                AnimUtils.Y(floor_2, top, 0);
            } else {
                AnimUtils.Y(floor_2, bottom, 0);
            }
            floor_2.setVisibility(View.VISIBLE);
        }

        if (floor_3.getVisibility() == View.GONE) {
            if (fg3 == -1) {
                AnimUtils.Y(floor_3, top, 0);
            } else {
                AnimUtils.Y(floor_3, bottom, 0);
            }
            floor_3.setVisibility(View.VISIBLE);
        }
        if (floor_4.getVisibility() == View.GONE) {
            if (fg4 == -1) {
                AnimUtils.Y(floor_4, top, 0);
            } else {
                AnimUtils.Y(floor_4, bottom, 0);
            }
            floor_4.setVisibility(View.VISIBLE);
        }
        if (floor_5.getVisibility() == View.GONE) {
            if (fg5 == -1) {
                AnimUtils.Y(floor_5, top, 0);
            } else {
                AnimUtils.Y(floor_5, bottom, 0);
            }
            floor_5.setVisibility(View.VISIBLE);
        }

        AnimUtils.RX(floor_1, 0, rx);
        AnimUtils.R(floor_1, 0, r);
        AnimUtils.S(floor_1, 0, s);
        AnimUtils.Y(floor_1, 0, 220);

        AnimUtils.RX(floor_2, 0, rx);
        AnimUtils.R(floor_2, 0, r);
        AnimUtils.S(floor_2, 0, s);
        AnimUtils.X(floor_2, 0, f2);
        AnimUtils.Y(floor_2, 0, 110);

        AnimUtils.RX(floor_3, 0, rx);
        AnimUtils.R(floor_3, 0, r);
        AnimUtils.S(floor_3, 0, s);
        AnimUtils.X(floor_3, 0, f3);

        AnimUtils.RX(floor_4, 0, rx);
        AnimUtils.R(floor_4, 0, r);
        AnimUtils.S(floor_4, 0, s);
        AnimUtils.X(floor_4, 0, f4);
        AnimUtils.Y(floor_4, 0, -110);

        AnimUtils.RX(floor_5, 0, rx);
        AnimUtils.R(floor_5, 0, r);
        AnimUtils.S(floor_5, 0, s);
        AnimUtils.X(floor_5, 0, f5);
        AnimUtils.Y(floor_5, 0, -220);

        floor_1.setEnabled(true);
        floor_2.setEnabled(true);
        floor_3.setEnabled(true);
        floor_4.setEnabled(true);
        floor_5.setEnabled(true);
    }

}
