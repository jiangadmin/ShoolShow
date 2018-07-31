package com.jiang.shoolshow.fragment;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jiang.shoolshow.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.Map;

/**
 * @author: jiangadmin
 * @date: 2018/7/26
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 楼层
 */
public class Floor_Fragment extends Fragment {
    private static final String TAG = "Floor_Fragment";

    Floor_11_Fragment floor_11_fragment;
    Floor_12_Fragment floor_12_fragment;
    Floor_13_Fragment floor_13_fragment;
    Floor_14_Fragment floor_14_fragment;
    Floor_15_Fragment floor_15_fragment;

    Floor_21_Fragment floor_21_fragment;
    Floor_22_Fragment floor_22_fragment;
    Floor_23_Fragment floor_23_fragment;
    Floor_24_Fragment floor_24_fragment;
    Floor_25_Fragment floor_25_fragment;

    Floor_31_Fragment floor_31_fragment;
    Floor_32_Fragment floor_32_fragment;
    Floor_33_Fragment floor_33_fragment;
    Floor_34_Fragment floor_34_fragment;
    Floor_35_Fragment floor_35_fragment;
    Floor_36_Fragment floor_36_fragment;

    Floor_41_Fragment floor_41_fragment;
    Floor_42_Fragment floor_42_fragment;
    Floor_43_Fragment floor_43_fragment;
    Floor_44_Fragment floor_44_fragment;
    Floor_45_Fragment floor_45_fragment;
    Floor_46_Fragment floor_46_fragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        return inflater.inflate(R.layout.fragment_floor, container, false);
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessage(Map map) {
        if (map.get("floor") != null) {
            ShowFragmet((Integer) map.get("floor"));
        }
    }

    /**
     * 控制二级显示
     *
     * @param vid
     */
    public void ShowFragmet(int vid) {
        FragmentTransaction floortion = getFragmentManager().beginTransaction();

        if (floor_11_fragment == null) {
            floor_11_fragment = new Floor_11_Fragment();
            floortion.add(R.id.main_floor, floor_11_fragment);
        }
        if (floor_12_fragment == null) {
            floor_12_fragment = new Floor_12_Fragment();
            floortion.add(R.id.main_floor, floor_12_fragment);
        }
        if (floor_13_fragment == null) {
            floor_13_fragment = new Floor_13_Fragment();
            floortion.add(R.id.main_floor, floor_13_fragment);
        }
        if (floor_14_fragment == null) {
            floor_14_fragment = new Floor_14_Fragment();
            floortion.add(R.id.main_floor, floor_14_fragment);
        }
        if (floor_15_fragment == null) {
            floor_15_fragment = new Floor_15_Fragment();
            floortion.add(R.id.main_floor, floor_15_fragment);
        }

        if (floor_21_fragment == null) {
            floor_21_fragment = new Floor_21_Fragment();
            floortion.add(R.id.main_floor, floor_21_fragment);
        }
        if (floor_22_fragment == null) {
            floor_22_fragment = new Floor_22_Fragment();
            floortion.add(R.id.main_floor, floor_22_fragment);
        }
        if (floor_23_fragment == null) {
            floor_23_fragment = new Floor_23_Fragment();
            floortion.add(R.id.main_floor, floor_23_fragment);
        }
        if (floor_24_fragment == null) {
            floor_24_fragment = new Floor_24_Fragment();
            floortion.add(R.id.main_floor, floor_24_fragment);
        }
        if (floor_25_fragment == null) {
            floor_25_fragment = new Floor_25_Fragment();
            floortion.add(R.id.main_floor, floor_25_fragment);
        }

        if (floor_31_fragment == null) {
            floor_31_fragment = new Floor_31_Fragment();
            floortion.add(R.id.main_floor, floor_31_fragment);
        }
        if (floor_32_fragment == null) {
            floor_32_fragment = new Floor_32_Fragment();
            floortion.add(R.id.main_floor, floor_32_fragment);
        }
        if (floor_33_fragment == null) {
            floor_33_fragment = new Floor_33_Fragment();
            floortion.add(R.id.main_floor, floor_33_fragment);
        }
        if (floor_34_fragment == null) {
            floor_34_fragment = new Floor_34_Fragment();
            floortion.add(R.id.main_floor, floor_34_fragment);
        }
        if (floor_35_fragment == null) {
            floor_35_fragment = new Floor_35_Fragment();
            floortion.add(R.id.main_floor, floor_35_fragment);
        }
        if (floor_36_fragment == null) {
            floor_36_fragment = new Floor_36_Fragment();
            floortion.add(R.id.main_floor, floor_36_fragment);
        }

        if (floor_41_fragment == null) {
            floor_41_fragment = new Floor_41_Fragment();
            floortion.add(R.id.main_floor, floor_41_fragment);
        }
        if (floor_42_fragment == null) {
            floor_42_fragment = new Floor_42_Fragment();
            floortion.add(R.id.main_floor, floor_42_fragment);
        }
        if (floor_43_fragment == null) {
            floor_43_fragment = new Floor_43_Fragment();
            floortion.add(R.id.main_floor, floor_43_fragment);
        }
        if (floor_44_fragment == null) {
            floor_44_fragment = new Floor_44_Fragment();
            floortion.add(R.id.main_floor, floor_44_fragment);
        }
        if (floor_45_fragment == null) {
            floor_45_fragment = new Floor_45_Fragment();
            floortion.add(R.id.main_floor, floor_45_fragment);
        }
        if (floor_46_fragment == null) {
            floor_46_fragment = new Floor_46_Fragment();
            floortion.add(R.id.main_floor, floor_46_fragment);
        }

        floortion.hide(floor_11_fragment);
        floortion.hide(floor_12_fragment);
        floortion.hide(floor_13_fragment);
        floortion.hide(floor_14_fragment);
        floortion.hide(floor_15_fragment);

        floortion.hide(floor_21_fragment);
        floortion.hide(floor_22_fragment);
        floortion.hide(floor_23_fragment);
        floortion.hide(floor_24_fragment);
        floortion.hide(floor_25_fragment);

        floortion.hide(floor_31_fragment);
        floortion.hide(floor_32_fragment);
        floortion.hide(floor_33_fragment);
        floortion.hide(floor_34_fragment);
        floortion.hide(floor_35_fragment);
        floortion.hide(floor_36_fragment);

        floortion.hide(floor_41_fragment);
        floortion.hide(floor_42_fragment);
        floortion.hide(floor_43_fragment);
        floortion.hide(floor_44_fragment);
        floortion.hide(floor_45_fragment);
        floortion.hide(floor_46_fragment);

        switch (vid) {
            case 11:
                Log.e(TAG, "ShowFragmet: 1-1");
                floortion.show(floor_11_fragment);
                break;
            case 12:
                floortion.show(floor_12_fragment);
                break;
            case 13:
                floortion.show(floor_13_fragment);
                break;
            case 14:
                floortion.show(floor_14_fragment);
                break;
            case 15:
                floortion.show(floor_15_fragment);
                break;

            case 21:
                floortion.show(floor_21_fragment);
                break;
            case 22:
                floortion.show(floor_22_fragment);
                break;
            case 23:
                floortion.show(floor_23_fragment);
                break;
            case 24:
                floortion.show(floor_24_fragment);
                break;
            case 25:
                floortion.show(floor_25_fragment);
                break;

            case 31:
                floortion.show(floor_31_fragment);
                break;
            case 32:
                floortion.show(floor_32_fragment);
                break;
            case 33:
                floortion.show(floor_33_fragment);
                break;
            case 34:
                floortion.show(floor_34_fragment);
                break;
            case 35:
                floortion.show(floor_35_fragment);
                break;
            case 36:
                floortion.show(floor_36_fragment);
                break;

            case 41:
                floortion.show(floor_41_fragment);
                break;
            case 42:
                floortion.show(floor_42_fragment);
                break;
            case 43:
                floortion.show(floor_43_fragment);
                break;
            case 44:
                floortion.show(floor_44_fragment);
                break;
            case 45:
                floortion.show(floor_45_fragment);
                break;
            case 46:
                floortion.show(floor_46_fragment);
                break;

            default:
                break;
        }

        floortion.commit();
    }
}
