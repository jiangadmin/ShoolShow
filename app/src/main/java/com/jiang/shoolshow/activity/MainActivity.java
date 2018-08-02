package com.jiang.shoolshow.activity;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.adapter.Floor_Info_Adapter;
import com.jiang.shoolshow.entity.Building_Entity;
import com.jiang.shoolshow.entity.Const;
import com.jiang.shoolshow.entity.Floor_Entity;
import com.jiang.shoolshow.entity.Weather_Entity;
import com.jiang.shoolshow.fragment.Building_Fragment;
import com.jiang.shoolshow.fragment.Classroom_Fragment;
import com.jiang.shoolshow.fragment.Floor_Fragment;
import com.jiang.shoolshow.servlet.Get_Building_Info;
import com.jiang.shoolshow.servlet.Get_Weather;
import com.jiang.shoolshow.utils.LogUtil;
import com.jiang.shoolshow.view.ListViewForScrollView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    View main;

    ImageView left, right, home, help;

    LinearLayout main_main;

    ImageView item_1_icon;

    TextView item_1_tianqi, item_1_wendu, item_2_title;

    RelativeLayout item_2_view;

    Building_Fragment building_fragment;
    Floor_Fragment floor_fragment;
    Classroom_Fragment classroom_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
        setSystemUIVisible(false);
        setContentView(R.layout.activity_main);

        initview();

        //获取楼层信息
//        new Get_Floor_Info().execute(Const.IP,"2");
        //获取教室信息
//        new Get_Classroom_Info().execute(Const.IP,"2"," 教3－203");
        //获取天气
        new Get_Weather(this).execute();
    }

    @Override
    protected void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMeaage(Map map) {

        //楼栋加载完毕
        if (map.get("building_ready") != null) {
            ShowFragmet(1, 1);

            //获取教学楼信息
            new Get_Building_Info(this).execute(Const.IP);
        }

    }

    private void setSystemUIVisible(boolean show) {
        if (show) {
            int uiFlags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            uiFlags |= 0x00001000;
            getWindow().getDecorView().setSystemUiVisibility(uiFlags);
        } else {
            int uiFlags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN;
            uiFlags |= 0x00001000;
            getWindow().getDecorView().setSystemUiVisibility(uiFlags);
        }
    }

    private void initview() {
        main_main = findViewById(R.id.main_main);

        main = findViewById(R.id.main);

        left = findViewById(R.id.left);
        right = findViewById(R.id.right);
        home = findViewById(R.id.home);
        help = findViewById(R.id.help);

        item_1_icon = findViewById(R.id.weather_icon);
        item_1_wendu = findViewById(R.id.weather_wendu);
        item_1_tianqi = findViewById(R.id.weather_tianqi);

        item_2_title = findViewById(R.id.item_2_title);
        item_2_view = findViewById(R.id.item_2_view);

        left.setOnClickListener(this);
        right.setOnClickListener(this);
        home.setOnClickListener(this);
        help.setOnClickListener(this);

        //初始化操作
        ShowFragmet(0, 0);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.left:
                break;
            case R.id.right:
//                ShowFragmet(2, 11);
                break;
            case R.id.home:

                ShowFragmet(1, 1);

                //获取教学楼信息
                new Get_Building_Info(this).execute(Const.IP);

                break;

            case R.id.help:
                break;

        }
    }

    /**
     * 天气返回
     *
     * @param bean
     */
    public void CallBack_Weather(Weather_Entity.ResultBean bean) {

        item_1_tianqi.setText(bean.getWeather());
        item_1_wendu.setText(bean.getTemperature());

        int Resource = -1;

        switch (bean.getWeather()) {
            case "晴":
                Resource = R.drawable.ic_weacther_01;
                break;
            case "阴":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "多云":
                Resource = R.drawable.ic_weacther_04;
                break;
            case "小雨":
                Resource = R.drawable.ic_weacther_05;
                break;
            case "中雨":
                Resource = R.drawable.ic_weacther_06;
                break;
            case "大雨":
                Resource = R.drawable.ic_weacther_07;
                break;
            case "阵雨":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "暴雨":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "雾":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "霾":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "霜冻":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "暴风":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "台风":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "暴风雪":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "小雪":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "中雪":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "大雪":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "雨夹雪":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "冰雹":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "浮尘":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "扬沙":
                Resource = R.drawable.ic_weacther_02;
                break;
        }

        item_1_icon.setImageResource(Resource);
    }

    /**
     * 楼栋信息
     *
     * @param bean
     */
    public void CallBack_Building(Building_Entity.ResultBean bean) {
        String text = "教室数量: %s 间\n当前在使用教室: %s 间\n当前空闲教室: %s 间\n今日课程安排: %s 节\n今日有课班级: %s 个\n今日服务学生(人次): %s 人";
        item_2_view.removeAllViews();
        TextView textView = new TextView(this);
        textView.setTextSize(10);
        textView.setLineSpacing(10, 1);
        textView.setText(String.format(text, "0", bean.getJsUsingTotel(), "0", bean.getKcTotel(), bean.getBjTotel(), bean.getStudentTotel()));
        item_2_view.addView(textView);
        item_2_title.setText("教室分布");

        //发送数据到指定楼栋
        EventBus.getDefault().post(bean);
    }

    /**
     * 楼层信息
     *
     * @param entity
     */
    public void CallBack_Floor(final Floor_Entity entity) {
        item_2_title.setText("课程信息");

        item_2_view.removeAllViews();

        ShowFragmet(2, entity.getFloor());

        ListViewForScrollView listViewForScrollView = new ListViewForScrollView(this);

        Floor_Info_Adapter adapter = new Floor_Info_Adapter(this);
        adapter.setResultBeans(entity.getResult().getSkjsInfoList());

        listViewForScrollView.setAdapter(adapter);

        item_2_view.addView(listViewForScrollView);

        listViewForScrollView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ShowFragmet(3, 0);

                item_2_view.removeAllViews();

                View v = View.inflate(MainActivity.this, R.layout.view_teacher, null);
                ImageView head = v.findViewById(R.id.teacher_head);
                TextView name = v.findViewById(R.id.teacher_name);
                TextView gender = v.findViewById(R.id.teacher_gender);
                TextView number = v.findViewById(R.id.teacher_number);
                TextView level = v.findViewById(R.id.teacher_level);
                TextView message = v.findViewById(R.id.message);

                name.setText("姓名：" + entity.getResult().getSkjsInfoList().get(position).getJsxm());
                gender.setText("性别：" + entity.getResult().getSkjsInfoList().get(position).getJsxb());
                number.setText("工号：" + entity.getResult().getSkjsInfoList().get(position).getJsgh());
                level.setText("职称：" + entity.getResult().getSkjsInfoList().get(position).getJszc());
                message.setText("研究方向：\n" + entity.getResult().getSkjsInfoList().get(position).getJsyjfx());

                item_2_view.addView(v);
                item_2_title.setText("教师介绍");
                classroom_fragment.initeven(entity.getResult().getSkjsInfoList().get(position));
            }

        });

        EventBus.getDefault().post(entity);
        LogUtil.e(TAG,"发送数据");

    }

    /**
     * 控制二级显示
     *
     * @param vid
     */
    public void ShowFragmet(int vid, int i) {

        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        if (building_fragment == null) {
            building_fragment = new Building_Fragment();
            transaction.add(R.id.main, building_fragment);
        }

        if (floor_fragment == null) {
            floor_fragment = new Floor_Fragment();
            transaction.add(R.id.main, floor_fragment);
        }

        if (classroom_fragment == null) {
            classroom_fragment = new Classroom_Fragment();
            transaction.add(R.id.main, classroom_fragment);
        }

        transaction.hide(building_fragment);
        transaction.hide(floor_fragment);
        transaction.hide(classroom_fragment);

        switch (vid) {
            case 1:
                Log.e(TAG, "ShowFragmet: 显示楼");
                transaction.show(building_fragment);

                Map map = new HashMap();
                map.put("building", i);
                EventBus.getDefault().post(map);

                break;
            case 2:
                Log.e(TAG, "ShowFragmet: 显示层");
                transaction.show(floor_fragment);

                Map map2 = new HashMap();
                map2.put("floor", i);
                EventBus.getDefault().post(map2);

                break;

            case 3:
                Log.e(TAG, "ShowFragmet: 显示教室");
                left.setEnabled(true);
                home.setEnabled(true);

                transaction.show(classroom_fragment);
                break;
            default:
                break;

        }

        transaction.commit();
    }

}
