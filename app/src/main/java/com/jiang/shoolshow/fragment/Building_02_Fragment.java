package com.jiang.shoolshow.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jiang.shoolshow.R;
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
 * TODO: 教学楼2
 */
public class Building_02_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Building_02_Fragment";

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

    TextView r_100, r_101, r_102, r_103, r_104, r_105, r_106, r_113, r_114, r_115, r_116, r_117, r_118,
            r_201, r_202, r_203, r_204, r_205, r_208, r_209, r_211, r_212, r_213, r_214, r_215, r_216, r_225, r_226, r_227,
            r_300, r_301, r_302, r_303, r_304, r_305, r_308, r_309, r_311, r_312, r_313, r_315, r_316,
            r_400, r_401, r_402, r_403, r_404, r_405, r_409, r_410, r_413, r_414, r_415, r_416, r_417, r_418, r_427, r_428, r_429,
            r_506, r_507, r_508, r_509, r_510, r_512, r_516, r_518, r_519, r_520, r_521, r_522, r_523, r_532, r_533, r_534, r_535;

    Map<String, TextView> map = new HashMap();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_2, container, false);
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        floor_1 = view.findViewById(R.id.building_2_1);
        floor_2 = view.findViewById(R.id.building_2_2);
        floor_3 = view.findViewById(R.id.building_2_3);
        floor_4 = view.findViewById(R.id.building_2_4);
        floor_5 = view.findViewById(R.id.building_2_5);

        //一楼
        r_100 = view.findViewById(R.id.building_2_1_100);
        r_101 = view.findViewById(R.id.building_2_1_101);
        r_102 = view.findViewById(R.id.building_2_1_102);
        r_103 = view.findViewById(R.id.building_2_1_103);
        r_104 = view.findViewById(R.id.building_2_1_104);
        r_105 = view.findViewById(R.id.building_2_1_105);
        r_106 = view.findViewById(R.id.building_2_1_106);
        r_113 = view.findViewById(R.id.building_2_1_113);
        r_114 = view.findViewById(R.id.building_2_1_114);
        r_115 = view.findViewById(R.id.building_2_1_115);
        r_116 = view.findViewById(R.id.building_2_1_116);
        r_117 = view.findViewById(R.id.building_2_1_117);
        r_118 = view.findViewById(R.id.building_2_1_118);

        //二楼
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

        //三楼
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

        //四楼
        r_400 = view.findViewById(R.id.building_2_4_400);
        r_401 = view.findViewById(R.id.building_2_4_401);
        r_402 = view.findViewById(R.id.building_2_4_402);
        r_403 = view.findViewById(R.id.building_2_4_403);
        r_404 = view.findViewById(R.id.building_2_4_404);
        r_405 = view.findViewById(R.id.building_2_4_405);
        r_409 = view.findViewById(R.id.building_2_4_409);
        r_410 = view.findViewById(R.id.building_2_4_410);
        r_413 = view.findViewById(R.id.building_2_4_413);
        r_414 = view.findViewById(R.id.building_2_4_414);
        r_415 = view.findViewById(R.id.building_2_4_415);
        r_416 = view.findViewById(R.id.building_2_4_416);
        r_417 = view.findViewById(R.id.building_2_4_417);
        r_418 = view.findViewById(R.id.building_2_4_418);
        r_427 = view.findViewById(R.id.building_2_4_427);
        r_428 = view.findViewById(R.id.building_2_4_428);
        r_429 = view.findViewById(R.id.building_2_4_429);

        //五楼
        r_506 = view.findViewById(R.id.building_2_5_506);
        r_507 = view.findViewById(R.id.building_2_5_507);
        r_508 = view.findViewById(R.id.building_2_5_508);
        r_509 = view.findViewById(R.id.building_2_5_509);
        r_510 = view.findViewById(R.id.building_2_5_510);
        r_512 = view.findViewById(R.id.building_2_5_512);
        r_516 = view.findViewById(R.id.building_2_5_516);
        r_518 = view.findViewById(R.id.building_2_5_518);
        r_519 = view.findViewById(R.id.building_2_5_519);
        r_520 = view.findViewById(R.id.building_2_5_520);
        r_521 = view.findViewById(R.id.building_2_5_521);
        r_522 = view.findViewById(R.id.building_2_5_522);
        r_523 = view.findViewById(R.id.building_2_5_523);
        r_532 = view.findViewById(R.id.building_2_5_532);
        r_533 = view.findViewById(R.id.building_2_5_533);
        r_534 = view.findViewById(R.id.building_2_5_534);
        r_535 = view.findViewById(R.id.building_2_5_535);

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

        map.put("教2－100", r_100);
        map.put("教2－101", r_101);
        map.put("教2－102", r_102);
        map.put("教2－103", r_103);
        map.put("教2－104", r_104);
        map.put("教2－105", r_105);
        map.put("教2－106", r_106);
        map.put("教2－113", r_113);
        map.put("教2－114", r_114);
        map.put("教2－115", r_115);
        map.put("教2－116", r_116);
        map.put("教2－117", r_117);
        map.put("教2－118", r_118);

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

        map.put("教2－400", r_400);
        map.put("教2－401", r_401);
        map.put("教2－402", r_402);
        map.put("教2－403", r_403);
        map.put("教2－404", r_404);
        map.put("教2－405", r_405);
        map.put("教2－409", r_409);
        map.put("教2－410", r_410);
        map.put("教2－413", r_413);
        map.put("教2－414", r_414);
        map.put("教2－415", r_415);
        map.put("教2－416", r_416);
        map.put("教2－417", r_417);
        map.put("教2－418", r_418);
        map.put("教2－427", r_427);
        map.put("教2－428", r_428);
        map.put("教2－429", r_429);

        map.put("教2－506", r_506);
        map.put("教2－507", r_507);
        map.put("教2－508", r_508);
        map.put("教2－509", r_509);
        map.put("教2－510", r_510);
        map.put("教2－512", r_512);
        map.put("教2－516", r_516);
        map.put("教2－518", r_518);
        map.put("教2－519", r_519);
        map.put("教2－520", r_520);
        map.put("教2－521", r_521);
        map.put("教2－522", r_522);
        map.put("教2－523", r_523);
        map.put("教2－532", r_532);
        map.put("教2－533", r_533);
        map.put("教2－534", r_534);
        map.put("教2－535", r_535);


        FW();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.building_2_1:
                ZK(21);
                break;
            case R.id.building_2_2:
                ZK(22);
                break;
            case R.id.building_2_3:
                ZK(23);
                break;
            case R.id.building_2_4:
                ZK(24);
                break;
            case R.id.building_2_5:
                ZK(25);
                break;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Building_Entity.ResultBean bean) {
        if (bean.getBuildCode() == 1) {
            for (Building_Entity.ResultBean.SkjsInfoListBean listBean : bean.getSkjsInfoList()) {
                if (map.get(listBean.getSkdd()) != null) {
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

        new Get_Floor_Info(getActivity(), i).execute(Const.IP, String.valueOf(i % 10));

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
