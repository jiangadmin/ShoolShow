package com.jiang.shoolshow.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jiang.shoolshow.R;

/**
 * @author: jiangadmin
 * @date: 2018/7/26
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 楼层
 */
public class Floor_13_Fragment extends Fragment {
    private static final String TAG = "Floor_13_Fragment";

    Button b_101, b_102, b_103, b_104, b_105, b_106, b_107, b_108, b_109, b_110;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.building_1_3,container,false);
    }
}
