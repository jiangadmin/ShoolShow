package com.jiang.shoolshow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.jiang.shoolshow.utils.AnimUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    RelativeLayout main, floor_1, floor_2, floor_3, floor_4, floor_5;

    Button back, home, menu;

    List<RelativeLayout> floor = new ArrayList<>();

    LinearLayout main_main;
    int demo_x = 0, demo_y = 0, demo_r = 0, demo_rx = 0, demo_ry = 0;

    /**
     * -1 在上 0 显示 1 在下
     */
    int fg1 = 0, fg2 = 0, fg3 = 0, fg4 = 0, fg5 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();
    }

    int rx = 60, r = -10;

    int f1 = 0, f2 = 10, f3 = 20, f4 = 30, f5 = 40;

    int top = -1080;
    int bottom = 1080;

    private void initview() {
        main_main = findViewById(R.id.main_main);
        main = findViewById(R.id.main);
        floor_1 = findViewById(R.id.floor_1);
        floor_2 = findViewById(R.id.floor_2);
        floor_3 = findViewById(R.id.floor_3);
        floor_4 = findViewById(R.id.floor_4);
        floor_5 = findViewById(R.id.floor_5);

        back = findViewById(R.id.back);
        home = findViewById(R.id.home);
        menu = findViewById(R.id.menu);

        FW();
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

        back.setOnClickListener(this);
        home.setOnClickListener(this);
        menu.setOnClickListener(this);

        back.setEnabled(false);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                FW();
                break;

            case R.id.floor_1:

                XZ();
                ZK(1);
                break;
            case R.id.floor_2:
                XZ();
                ZK(2);
                break;
            case R.id.floor_3:
                XZ();
                ZK(3);
                break;
            case R.id.floor_4:
                XZ();
                ZK(4);
                break;
            case R.id.floor_5:
                XZ();
                ZK(5);
                break;
        }
    }

    /**
     * 楼层回正
     */
    public void XZ() {
        AnimUtils.RX(floor_1, rx, 0);
        AnimUtils.RX(floor_2, rx, 0);
        AnimUtils.RX(floor_3, rx, 0);
        AnimUtils.RX(floor_4, rx, 0);
        AnimUtils.RX(floor_5, rx, 0);

        AnimUtils.R(floor_1, r, 0);
        AnimUtils.R(floor_2, r, 0);
        AnimUtils.R(floor_3, r, 0);
        AnimUtils.R(floor_4, r, 0);
        AnimUtils.R(floor_5, r, 0);

    }

    /**
     * 其他布局走开
     *
     * @param i
     */
    public void ZK(int i) {

        back.setEnabled(true);
        floor_1.setEnabled(false);
        floor_2.setEnabled(false);
        floor_3.setEnabled(false);
        floor_4.setEnabled(false);
        floor_5.setEnabled(false);

        if (i == 1) {
            AnimUtils.Y(floor_2, 0, top);
            AnimUtils.Y(floor_3, 0, top);
            AnimUtils.Y(floor_4, 0, top);
            AnimUtils.Y(floor_5, 0, top);

            fg2 = -1;
            fg3 = -1;
            fg4 = -1;
            fg5 = -1;

            AnimUtils.S(floor_1, 0.7F, 1);

            try {
                Thread.sleep(100);

                floor_2.setVisibility(View.GONE);
                floor_3.setVisibility(View.GONE);
                floor_4.setVisibility(View.GONE);
                floor_5.setVisibility(View.GONE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (i == 2) {
            AnimUtils.Y(floor_1, 0, bottom);
            AnimUtils.Y(floor_3, 0, top);
            AnimUtils.Y(floor_4, 0, top);
            AnimUtils.Y(floor_5, 0, top);

            fg1 = 1;
            fg3 = -1;
            fg4 = -1;
            fg5 = -1;

            AnimUtils.S(floor_2, 0.7F, 1);

            try {
                Thread.sleep(100);

                floor_1.setVisibility(View.GONE);
                floor_3.setVisibility(View.GONE);
                floor_4.setVisibility(View.GONE);
                floor_5.setVisibility(View.GONE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (i == 3) {
            AnimUtils.Y(floor_1, 0, top);
            AnimUtils.Y(floor_2, 0, top);
            AnimUtils.Y(floor_4, 0, bottom);
            AnimUtils.Y(floor_5, 0, bottom);

            fg1 = -1;
            fg2 = -1;
            fg4 = 1;
            fg5 = 1;

            AnimUtils.S(floor_3, 0.7F, 1);

            try {
                Thread.sleep(100);

                floor_1.setVisibility(View.GONE);
                floor_2.setVisibility(View.GONE);
                floor_4.setVisibility(View.GONE);
                floor_5.setVisibility(View.GONE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (i == 4) {
            AnimUtils.Y(floor_1, 0, top);
            AnimUtils.Y(floor_2, 0, top);
            AnimUtils.Y(floor_3, 0, top);
            AnimUtils.Y(floor_5, 0, bottom);

            fg1 = -1;
            fg2 = -1;
            fg3 = -1;
            fg5 = 1;

            AnimUtils.S(floor_4, 0.7F, 1);

            try {
                Thread.sleep(100);

                floor_1.setVisibility(View.GONE);
                floor_2.setVisibility(View.GONE);
                floor_3.setVisibility(View.GONE);
                floor_5.setVisibility(View.GONE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (i == 5) {
            AnimUtils.Y(floor_1, 0, bottom);
            AnimUtils.Y(floor_2, 0, bottom);
            AnimUtils.Y(floor_3, 0, bottom);
            AnimUtils.Y(floor_4, 0, bottom);

            fg1 = 1;
            fg2 = 1;
            fg3 = 1;
            fg4 = 1;

            AnimUtils.S(floor_5, 0.7F, 1);

            try {
                Thread.sleep(100);

                floor_1.setVisibility(View.GONE);
                floor_2.setVisibility(View.GONE);
                floor_3.setVisibility(View.GONE);
                floor_4.setVisibility(View.GONE);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void FW() {

        back.setEnabled(true);
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
        AnimUtils.S(floor_1, 0, 0.7F);

        AnimUtils.RX(floor_2, 0, rx);
        AnimUtils.R(floor_2, 0, r);
        AnimUtils.S(floor_2, 0, 0.7F);
        AnimUtils.X(floor_2, 0, f2);

        AnimUtils.RX(floor_3, 0, rx);
        AnimUtils.R(floor_3, 0, r);
        AnimUtils.S(floor_3, 0, 0.7F);
        AnimUtils.X(floor_3, 0, f3);

        AnimUtils.RX(floor_4, 0, rx);
        AnimUtils.R(floor_4, 0, r);
        AnimUtils.S(floor_4, 0, 0.7F);
        AnimUtils.X(floor_4, 0, f4);

        AnimUtils.RX(floor_5, 0, rx);
        AnimUtils.R(floor_5, 0, r);
        AnimUtils.S(floor_5, 0, 0.7F);
        AnimUtils.X(floor_5, 0, f5);

        floor_1.setEnabled(true);
        floor_2.setEnabled(true);
        floor_3.setEnabled(true);
        floor_4.setEnabled(true);
        floor_5.setEnabled(true);
    }
}
