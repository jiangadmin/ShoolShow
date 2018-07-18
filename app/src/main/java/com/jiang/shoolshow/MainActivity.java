package com.jiang.shoolshow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jiang.shoolshow.entity.Building_Entity;
import com.jiang.shoolshow.servlet.Get_Building_Info;
import com.jiang.shoolshow.servlet.Get_Classroom_Info;
import com.jiang.shoolshow.servlet.Get_Floor_Info;
import com.jiang.shoolshow.servlet.Get_Weather;
import com.jiang.shoolshow.utils.AnimUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    RelativeLayout main, floor_1, floor_2, floor_3, floor_4, floor_5;

    ImageView left,right, home, help;

    List<RelativeLayout> floor = new ArrayList<>();

    LinearLayout main_main;

    TextView item_2_text;
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

        //获取教学楼信息
        new Get_Building_Info(this).execute("192.168.0.123");
        //获取楼层信息
//        new Get_Floor_Info().execute("192.168.0.123","2");
        //获取教室信息
//        new Get_Classroom_Info().execute("192.168.0.123","2"," 教3－203");
        //获取天气
        new Get_Weather().execute();
    }

    int rx = 65, r =0;

    float s = 0.7F;

    int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0;

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

        left = findViewById(R.id.left);
        right = findViewById(R.id.right);
        home = findViewById(R.id.home);
        help = findViewById(R.id.help);

        item_2_text = findViewById(R.id.item_2_text);

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

        left.setOnClickListener(this);
        right.setOnClickListener(this);
        home.setOnClickListener(this);
        help.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.left:
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

    /**
     * 初始化  复位
     */
    public void FW() {
//
//        if (floor_1.getVisibility() == View.GONE) {
//            AnimUtils.Y(floor_1, bottom, 0);
//            floor_1.setVisibility(View.VISIBLE);
//        }
//
//        if (floor_2.getVisibility() == View.GONE) {
//            if (fg2 == -1) {
//                AnimUtils.Y(floor_2, top, 0);
//            } else {
//                AnimUtils.Y(floor_2, bottom, 0);
//            }
//            floor_2.setVisibility(View.VISIBLE);
//        }
//
//        if (floor_3.getVisibility() == View.GONE) {
//            if (fg3 == -1) {
//                AnimUtils.Y(floor_3, top, 0);
//            } else {
//                AnimUtils.Y(floor_3, bottom, 0);
//            }
//            floor_3.setVisibility(View.VISIBLE);
//        }
//        if (floor_4.getVisibility() == View.GONE) {
//            if (fg4 == -1) {
//                AnimUtils.Y(floor_4, top, 0);
//            } else {
//                AnimUtils.Y(floor_4, bottom, 0);
//            }
//            floor_4.setVisibility(View.VISIBLE);
//        }
//        if (floor_5.getVisibility() == View.GONE) {
//            if (fg5 == -1) {
//                AnimUtils.Y(floor_5, top, 0);
//            } else {
//                AnimUtils.Y(floor_5, bottom, 0);
//            }
//            floor_5.setVisibility(View.VISIBLE);
//        }

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

    /**
     * 楼栋信息
     * @param bean
     */
    public void CallBack_Building(Building_Entity.ResultBean bean){
        String text = "教室数量: %s 间\n当前在使用教室: %s 间\n当前空闲教室: %s 间\n今日课程安排: %s 节\n今日有课班级: %s 个\n今日服务学生(人次): %s 人";
        item_2_text.setText(String.format(text,"0",bean.getJsUsingTotel(),"0",bean.getKcTotel(),bean.getBjTotel(),bean.getStudentTotel()));
    }
}
