package com.jiang.shoolshow.fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jiang.shoolshow.R;

import java.util.List;

/**
 * @author: jiangadmin
 * @date: 2018/7/26
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 楼栋
 */
public class Building_Fragment extends Fragment {
    private static final String TAG = "Building_Fragment";

    Building_01_Fragment building_01_fragment;
    Building_02_Fragment building_02_fragment;
    Building_03_Fragment building_03_fragment;
    Building_04_Fragment building_04_fragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_building,container,false);
    return super.onCreateView(inflater, container, savedInstanceState);
    }



    /**
     * 控制二级显示
     *
     * @param vid
     */
    public void ShowFragmet(int vid) {
        FragmentTransaction buildingtion = getFragmentManager().beginTransaction();

        if (building_01_fragment == null) {
            building_01_fragment = new Building_01_Fragment();
            buildingtion.add(R.id.main, building_01_fragment);
        }
        if (building_02_fragment == null) {
            building_02_fragment = new Building_02_Fragment();
            buildingtion.add(R.id.main, building_02_fragment);
        }
        if (building_03_fragment == null) {
            building_03_fragment = new Building_03_Fragment();
            buildingtion.add(R.id.main, building_03_fragment);
        }
        if (building_04_fragment == null) {
            building_04_fragment = new Building_04_Fragment();
            buildingtion.add(R.id.main, building_04_fragment);
        }

        buildingtion.hide(building_01_fragment);
        buildingtion.hide(building_02_fragment);
        buildingtion.hide(building_03_fragment);
        buildingtion.hide(building_04_fragment);

        switch (vid) {
            case 1:
                buildingtion.show(building_01_fragment);
                break;
            case 2:
                buildingtion.show(building_02_fragment);
                break;
            case 3:
                buildingtion.show(building_03_fragment);
                break;
            case 4:
                buildingtion.show(building_04_fragment);
                break;
            default:
                break;

        }

        buildingtion.commit();
    }
}
