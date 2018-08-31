package com.jiang.shoolshow.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.activity.Floor_Activity;
import com.jiang.shoolshow.entity.Building_Entity;
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

    View floor_1, floor_2, floor_3, floor_4, floor_5, floor_6;

    Button floor_btn_1, floor_btn_2, floor_btn_3, floor_btn_4, floor_btn_5, floor_btn_6;


    List<View> floor = new ArrayList<>();

    int rx = 77, r = 0;

    float s = 0.85F;

    int x1 = -80, x2 = -40, x3 = 0, x4 = 40, x5 = 80, x6 = 120;

    int y1 = 250, y2 = 100, y3 = -50, y4 = -200, y5 = -350, y6 = -500;

    int top = -1080;
    int bottom = 1080;

    /**
     * -1 在上 0 显示 1 在下
     */
    int fg1 = 0, fg2 = 0, fg3 = 0, fg4 = 0, fg5 = 0;

    TextView r_101, r_102, r_103, r_104, r_105, r_106, r_107, r_108, r_109,
            r_201, r_202, r_203, r_204, r_205, r_208, r_213, r_214, r_215, r_216, r_225, r_226, r_227,
            r_300, r_301, r_302, r_303, r_304, r_305, r_308, r_309, r_310, r_312, r_313, r_322, r_323,
            r_400, r_401, r_402, r_403, r_404, r_405, r_408, r_409, r_410, r_412, r_413, r_417, r_418,
            r_506, r_507, r_508, r_509, r_510, r_511, r_512, r_513, r_515, r_520, r_526, r_527, r_528, r_537, r_538, r_539,
            r_601, r_602, r_603, r_604, r_606, r_611;

    Map<String, TextView> map = new HashMap<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_3, container, false);
    }

    @Override
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        floor_1 = view.findViewById(R.id.building_3_1);
        floor_2 = view.findViewById(R.id.building_3_2);
        floor_3 = view.findViewById(R.id.building_3_3);
        floor_4 = view.findViewById(R.id.building_3_4);
        floor_5 = view.findViewById(R.id.building_3_5);
        floor_6 = view.findViewById(R.id.building_3_6);

        floor_btn_1 = view.findViewById(R.id.btn_f1);
        floor_btn_2 = view.findViewById(R.id.btn_f2);
        floor_btn_3 = view.findViewById(R.id.btn_f3);
        floor_btn_4 = view.findViewById(R.id.btn_f4);
        floor_btn_5 = view.findViewById(R.id.btn_f5);
        floor_btn_6 = view.findViewById(R.id.btn_f6);

        floor_btn_1.setOnClickListener(this);
        floor_btn_2.setOnClickListener(this);
        floor_btn_3.setOnClickListener(this);
        floor_btn_4.setOnClickListener(this);
        floor_btn_5.setOnClickListener(this);
        floor_btn_6.setOnClickListener(this);

        r_101 = view.findViewById(R.id.building_3_1_101);
        r_102 = view.findViewById(R.id.building_3_1_102);
        r_103 = view.findViewById(R.id.building_3_1_103);
        r_104 = view.findViewById(R.id.building_3_1_104);
        r_105 = view.findViewById(R.id.building_3_1_105);
        r_106 = view.findViewById(R.id.building_3_1_106);
        r_107 = view.findViewById(R.id.building_3_1_107);
        r_108 = view.findViewById(R.id.building_3_1_108);
        r_109 = view.findViewById(R.id.building_3_1_109);


        r_201 = view.findViewById(R.id.building_3_2_201);
        r_202 = view.findViewById(R.id.building_3_2_202);
        r_203 = view.findViewById(R.id.building_3_2_203);
        r_204 = view.findViewById(R.id.building_3_2_204);
        r_205 = view.findViewById(R.id.building_3_2_205);
        r_208 = view.findViewById(R.id.building_3_2_208);
        r_213 = view.findViewById(R.id.building_3_2_213);
        r_214 = view.findViewById(R.id.building_3_2_214);
        r_215 = view.findViewById(R.id.building_3_2_215);
        r_216 = view.findViewById(R.id.building_3_2_216);
        r_225 = view.findViewById(R.id.building_3_2_225);
        r_226 = view.findViewById(R.id.building_3_2_226);
        r_227 = view.findViewById(R.id.building_3_2_227);

        r_300 = view.findViewById(R.id.building_3_3_300);
        r_301 = view.findViewById(R.id.building_3_3_301);
        r_302 = view.findViewById(R.id.building_3_3_302);
        r_303 = view.findViewById(R.id.building_3_3_303);
        r_304 = view.findViewById(R.id.building_3_3_304);
        r_305 = view.findViewById(R.id.building_3_3_305);
        r_308 = view.findViewById(R.id.building_3_3_308);
        r_309 = view.findViewById(R.id.building_3_3_309);
        r_310 = view.findViewById(R.id.building_3_3_310);
        r_312 = view.findViewById(R.id.building_3_3_312);
        r_313 = view.findViewById(R.id.building_3_3_313);
        r_322 = view.findViewById(R.id.building_3_3_322);
        r_323 = view.findViewById(R.id.building_3_3_323);

        r_400 = view.findViewById(R.id.building_3_4_400);
        r_401 = view.findViewById(R.id.building_3_4_401);
        r_402 = view.findViewById(R.id.building_3_4_402);
        r_403 = view.findViewById(R.id.building_3_4_403);
        r_404 = view.findViewById(R.id.building_3_4_404);
        r_405 = view.findViewById(R.id.building_3_4_405);
        r_408 = view.findViewById(R.id.building_3_4_408);
        r_409 = view.findViewById(R.id.building_3_4_409);
        r_410 = view.findViewById(R.id.building_3_4_410);
        r_412 = view.findViewById(R.id.building_3_4_412);
        r_413 = view.findViewById(R.id.building_3_4_413);
        r_417 = view.findViewById(R.id.building_3_4_417);
        r_418 = view.findViewById(R.id.building_3_4_418);

        r_506 = view.findViewById(R.id.building_3_5_506);
        r_507 = view.findViewById(R.id.building_3_5_507);
        r_508 = view.findViewById(R.id.building_3_5_508);
        r_509 = view.findViewById(R.id.building_3_5_509);
        r_510 = view.findViewById(R.id.building_3_5_510);
        r_511 = view.findViewById(R.id.building_3_5_511);
        r_512 = view.findViewById(R.id.building_3_5_512);
        r_513 = view.findViewById(R.id.building_3_5_513);
        r_515 = view.findViewById(R.id.building_3_5_515);
        r_520 = view.findViewById(R.id.building_3_5_520);
        r_526 = view.findViewById(R.id.building_3_5_526);
        r_527 = view.findViewById(R.id.building_3_5_527);
        r_528 = view.findViewById(R.id.building_3_5_528);
        r_537 = view.findViewById(R.id.building_3_5_537);
        r_538 = view.findViewById(R.id.building_3_5_538);
        r_539 = view.findViewById(R.id.building_3_5_539);

        r_601 = view.findViewById(R.id.building_3_6_601);
        r_602 = view.findViewById(R.id.building_3_6_602);
        r_603 = view.findViewById(R.id.building_3_6_603);
        r_604 = view.findViewById(R.id.building_3_6_604);
        r_606 = view.findViewById(R.id.building_3_6_606);
        r_611 = view.findViewById(R.id.building_3_6_611);

        floor_1.setOnClickListener(this);
        floor_2.setOnClickListener(this);
        floor_3.setOnClickListener(this);
        floor_4.setOnClickListener(this);
        floor_5.setOnClickListener(this);
        floor_6.setOnClickListener(this);

        floor.add(floor_1);
        floor.add(floor_2);
        floor.add(floor_3);
        floor.add(floor_4);
        floor.add(floor_5);
        floor.add(floor_6);

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
        map.put("教3－204", r_204);
        map.put("教3－205", r_205);
        map.put("教3－208", r_208);
        map.put("教3－213", r_213);
        map.put("教3－214", r_214);
        map.put("教3－215", r_215);
        map.put("教3－216", r_216);
        map.put("教3－225", r_225);
        map.put("教3－226", r_226);
        map.put("教3－227", r_227);

        map.put("教3－300", r_300);
        map.put("教3－301", r_301);
        map.put("教3－302", r_302);
        map.put("教3－303", r_303);
        map.put("教3－304", r_304);
        map.put("教3－305", r_305);
        map.put("教3－308", r_308);
        map.put("教3－309", r_309);
        map.put("教3－310", r_310);
        map.put("教3－312", r_312);
        map.put("教3－313", r_313);
        map.put("教3－322", r_322);
        map.put("教3－323", r_323);

        map.put("教3－400", r_400);
        map.put("教3－401", r_401);
        map.put("教3－402", r_402);
        map.put("教3－403", r_403);
        map.put("教3－404", r_404);
        map.put("教3－405", r_405);
        map.put("教3－408", r_408);
        map.put("教3－409", r_409);
        map.put("教3－410", r_410);
        map.put("教3－412", r_412);
        map.put("教3－413", r_413);
        map.put("教3－417", r_417);
        map.put("教3－418", r_418);

        map.put("教3－506", r_506);
        map.put("教3－507", r_507);
        map.put("教3－508", r_508);
        map.put("教3－509", r_509);
        map.put("教3－510", r_510);
        map.put("教3－511", r_511);
        map.put("教3－512", r_512);
        map.put("教3－513", r_513);
        map.put("教3－515", r_515);
        map.put("教3－520", r_520);
        map.put("教3－526", r_526);
        map.put("教3－527", r_527);
        map.put("教3－528", r_528);
        map.put("教3－537", r_537);
        map.put("教3－538", r_538);
        map.put("教3－539", r_539);

        map.put("教3－601", r_601);
        map.put("教3－602", r_602);
        map.put("教3－603", r_603);
        map.put("教3－604", r_604);
        map.put("教3－606", r_606);
        map.put("教3－611", r_611);

        FW();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.building_3_1:
            case R.id.btn_f1:

                ZK(31);
                break;
            case R.id.building_3_2:
            case R.id.btn_f2:

                ZK(32);
                break;
            case R.id.building_3_3:
            case R.id.btn_f3:

                ZK(33);
                break;
            case R.id.building_3_4:
            case R.id.btn_f4:

                ZK(34);
                break;
            case R.id.building_3_5:
            case R.id.btn_f5:

                ZK(35);
                break;
            case R.id.building_3_6:
            case R.id.btn_f6:

                ZK(36);
                break;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessage(Building_Entity.ResultBean bean) {
        if (bean.getBuildCode() == 3) {
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

        Floor_Activity.start(getActivity(), i);

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
        AnimUtils.X(floor_1, 0, x1);
        AnimUtils.Y(floor_1, 0, y1);

        AnimUtils.RX(floor_2, 0, rx);
        AnimUtils.R(floor_2, 0, r);
        AnimUtils.S(floor_2, 0, s);
        AnimUtils.X(floor_2, 0, x2);
        AnimUtils.Y(floor_2, 0, y2);

        AnimUtils.RX(floor_3, 0, rx);
        AnimUtils.R(floor_3, 0, r);
        AnimUtils.S(floor_3, 0, s);
        AnimUtils.X(floor_3, 0, x3);
        AnimUtils.Y(floor_3, 0, y3);

        AnimUtils.RX(floor_4, 0, rx);
        AnimUtils.R(floor_4, 0, r);
        AnimUtils.S(floor_4, 0, s);
        AnimUtils.X(floor_4, 0, x4);
        AnimUtils.Y(floor_4, 0, y4);

        AnimUtils.RX(floor_5, 0, rx);
        AnimUtils.R(floor_5, 0, r);
        AnimUtils.S(floor_5, 0, s);
        AnimUtils.X(floor_5, 0, x5);
        AnimUtils.Y(floor_5, 0, y5);

        AnimUtils.RX(floor_6, 0, rx);
        AnimUtils.R(floor_6, 0, r);
        AnimUtils.S(floor_6, 0, s);
        AnimUtils.X(floor_6, 0, x6);
        AnimUtils.Y(floor_6, 0, y6);

        floor_1.setEnabled(true);
        floor_2.setEnabled(true);
        floor_3.setEnabled(true);
        floor_4.setEnabled(true);
        floor_5.setEnabled(true);
        floor_6.setEnabled(true);
    }
}
