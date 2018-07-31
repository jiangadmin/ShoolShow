package com.jiang.shoolshow.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jiang.shoolshow.R;

/**
 * @author: jiangadmin
 * @date: 2018/7/26
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 楼层
 */
public class Floor_11_Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Floor_11_Fragment";

    TextView b_101, b_102, b_103, b_104, b_105, b_106, b_107, b_108, b_109, b_110;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.building_1_1, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        b_101 = view.findViewById(R.id.building_1_1_101);
        b_102 = view.findViewById(R.id.building_1_1_102);
        b_103 = view.findViewById(R.id.building_1_1_103);
        b_104 = view.findViewById(R.id.building_1_1_104);
        b_105 = view.findViewById(R.id.building_1_1_105);
        b_106 = view.findViewById(R.id.building_1_1_106);
        b_107 = view.findViewById(R.id.building_1_1_107);
        b_108 = view.findViewById(R.id.building_1_1_108);
        b_109 = view.findViewById(R.id.building_1_1_109);
        b_110 = view.findViewById(R.id.building_1_1_110);

        b_101.setOnClickListener(this);
        b_102.setOnClickListener(this);
        b_103.setOnClickListener(this);
        b_104.setOnClickListener(this);
        b_105.setOnClickListener(this);
        b_106.setOnClickListener(this);
        b_107.setOnClickListener(this);
        b_108.setOnClickListener(this);
        b_109.setOnClickListener(this);
        b_110.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.building_1_1_101:
                break;
            case R.id.building_1_1_102:
                break;
            case R.id.building_1_1_103:
                break;
            case R.id.building_1_1_104:
                break;
            case R.id.building_1_1_105:
                break;
            case R.id.building_1_1_106:
                break;
            case R.id.building_1_1_107:
                break;
            case R.id.building_1_1_108:
                break;
            case R.id.building_1_1_109:
                break;
            case R.id.building_1_1_110:
                break;
        }
    }
}
