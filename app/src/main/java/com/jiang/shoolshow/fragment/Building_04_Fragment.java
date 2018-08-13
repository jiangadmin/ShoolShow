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
 * TODO: 教学楼4
 */
public class Building_04_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Building_04_Fragment";

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

    TextView r_101, r_102, r_103, r_104, r_105, r_106, r_109, r_110,
            r_201, r_202, r_204, r_205, r_206, r_208, r_209, r_211, r_214, r_225,
            r_300, r_301, r_302, r_304, r_306, r_308, r_309, r_311, r_312, r_313, r_314, r_315, r_316, r_325, r_326, r_327,
            r_400, r_401, r_402, r_405, r_406, r_407, r_409, r_410, r_413, r_414, r_415, r_417a, r_417b, r_427, r_428, r_429,
            r_506, r_507, r_508, r_509, r_510, r_521, r_522, r_523, r_532, r_533, r_534;

    Map<String, TextView> map = new HashMap();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.building_4, container, false);
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        floor_1 = view.findViewById(R.id.building_4_1);
        floor_2 = view.findViewById(R.id.building_4_2);
        floor_3 = view.findViewById(R.id.building_4_3);
        floor_4 = view.findViewById(R.id.building_4_4);
        floor_5 = view.findViewById(R.id.building_4_5);

        r_101 = view.findViewById(R.id.building_4_1_101);
        r_102 = view.findViewById(R.id.building_4_1_102);
        r_103 = view.findViewById(R.id.building_4_1_103);
        r_104 = view.findViewById(R.id.building_4_1_104);
        r_105 = view.findViewById(R.id.building_4_1_105);
        r_106 = view.findViewById(R.id.building_4_1_106);
        r_109 = view.findViewById(R.id.building_4_1_109);
        r_110 = view.findViewById(R.id.building_4_1_110);

        r_201 = view.findViewById(R.id.building_4_2_201);
        r_202 = view.findViewById(R.id.building_4_2_202);
        r_204 = view.findViewById(R.id.building_4_2_204);
        r_205 = view.findViewById(R.id.building_4_2_205);
        r_206 = view.findViewById(R.id.building_4_2_206);
        r_208 = view.findViewById(R.id.building_4_2_208);
        r_209 = view.findViewById(R.id.building_4_2_209);
        r_211 = view.findViewById(R.id.building_4_2_211);
        r_214 = view.findViewById(R.id.building_4_2_214);
        r_225 = view.findViewById(R.id.building_4_2_225);

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

        r_400 = view.findViewById(R.id.building_4_4_400);
        r_401 = view.findViewById(R.id.building_4_4_401);
        r_402 = view.findViewById(R.id.building_4_4_402);
        r_405 = view.findViewById(R.id.building_4_4_405);
        r_406 = view.findViewById(R.id.building_4_4_406);
        r_407 = view.findViewById(R.id.building_4_4_407);
        r_409 = view.findViewById(R.id.building_4_4_409);
        r_410 = view.findViewById(R.id.building_4_4_410);
        r_413 = view.findViewById(R.id.building_4_4_413);
        r_414 = view.findViewById(R.id.building_4_4_414);
        r_415 = view.findViewById(R.id.building_4_4_415);
        r_417a = view.findViewById(R.id.building_4_4_417a);
        r_417b = view.findViewById(R.id.building_4_4_417b);
        r_427 = view.findViewById(R.id.building_4_4_427);
        r_428 = view.findViewById(R.id.building_4_4_428);
        r_429 = view.findViewById(R.id.building_4_4_429);

        r_506 = view.findViewById(R.id.building_4_5_506);
        r_507 = view.findViewById(R.id.building_4_5_507);
        r_508 = view.findViewById(R.id.building_4_5_508);
        r_509 = view.findViewById(R.id.building_4_5_509);
        r_510 = view.findViewById(R.id.building_4_5_510);
        r_521 = view.findViewById(R.id.building_4_5_521);
        r_522 = view.findViewById(R.id.building_4_5_522);
        r_523 = view.findViewById(R.id.building_4_5_523);
        r_532 = view.findViewById(R.id.building_4_5_532);
        r_533 = view.findViewById(R.id.building_4_5_533);
        r_534 = view.findViewById(R.id.building_4_5_534);

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

        map.put("教4－101", r_101);
        map.put("教4－102", r_102);
        map.put("教4－103", r_103);
        map.put("教4－104", r_104);
        map.put("教4－105", r_105);
        map.put("教4－106", r_106);
        map.put("教4－109", r_109);
        map.put("教4－110", r_110);

        map.put("教4－201", r_201);
        map.put("教4－202", r_202);
        map.put("教4－204", r_204);
        map.put("教4－205", r_205);
        map.put("教4－206", r_206);
        map.put("教4－208", r_208);
        map.put("教4－209", r_209);
        map.put("教4－211", r_211);
        map.put("教4－214", r_214);
        map.put("教4－225", r_225);

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

        map.put("教4－400", r_400);
        map.put("教4－401", r_401);
        map.put("教4－402", r_402);
        map.put("教4－405", r_405);
        map.put("教4－406", r_406);
        map.put("教4－407", r_407);
        map.put("教4－409", r_409);
        map.put("教4－410", r_410);
        map.put("教4－413", r_413);
        map.put("教4－414", r_414);
        map.put("教4－415", r_415);
        map.put("教4－417a", r_417a);
        map.put("教4－417b", r_417b);
        map.put("教4－427", r_427);
        map.put("教4－428", r_428);
        map.put("教4－429", r_429);

        map.put("教4－506", r_506);
        map.put("教4－507", r_507);
        map.put("教4－508", r_508);
        map.put("教4－509", r_509);
        map.put("教4－510", r_510);
        map.put("教4－521", r_521);
        map.put("教4－522", r_522);
        map.put("教4－523", r_523);
        map.put("教4－532", r_532);
        map.put("教4－533", r_533);
        map.put("教4－534", r_534);

        FW();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.building_4_1:
                ZK(41);
                break;
            case R.id.building_4_2:
                ZK(42);
                break;
            case R.id.building_4_3:
                ZK(43);
                break;
            case R.id.building_4_4:
                ZK(44);
                break;
            case R.id.building_4_5:
                ZK(45);
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
