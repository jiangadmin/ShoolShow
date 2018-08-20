package com.jiang.shoolshow.activity;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.adapter.Floor_Info_Adapter;
import com.jiang.shoolshow.entity.Building_Entity;
import com.jiang.shoolshow.entity.Const;
import com.jiang.shoolshow.entity.Floor_Entity;
import com.jiang.shoolshow.entity.Teacher_Entity;
import com.jiang.shoolshow.fragment.Building_Fragment;
import com.jiang.shoolshow.fragment.Classroom_Fragment;
import com.jiang.shoolshow.fragment.Floor_Fragment;
import com.jiang.shoolshow.servlet.Get_Building_Info;
import com.jiang.shoolshow.utils.LogUtil;
import com.jiang.shoolshow.utils.ToolUtils;
import com.jiang.shoolshow.view.ListViewForScrollView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends Base_Activity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    View main;

    FloatingActionButton home;

//    ImageView left, right, home, help;

    ConstraintLayout main_main;

    TextView item_2_title, sn;

    RelativeLayout item_2_view;

    Building_Fragment building_fragment;
    Floor_Fragment floor_fragment;
    Classroom_Fragment classroom_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);

        setContentView(R.layout.activity_main);

        initview();

        //获取楼层信息
//        new Get_Floor_Info().execute(Const.IP,"2");
        //获取教室信息
//        new Get_Classroom_Info().execute(Const.IP,"2"," 教3－203");

        LogUtil.e(TAG, ToolUtils.getMyUUID());
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
            ShowFragmet(1, 0);

            //获取教学楼信息
            new Get_Building_Info(this).execute(Const.IP);
        }

        //获取教室数据
        if (map.get("floor") != null && map.get("room") != null) {
            LogUtil.e(TAG, "floor:" + map.get("floor"));
            LogUtil.e(TAG, "room:" + map.get("room"));

            ShowFragmet(3, 0);

            classroom_fragment.initeven(String.valueOf(map.get("floor")), (String) map.get("room"));
        }

    }

    private void initview() {
        main_main = findViewById(R.id.main_main);

        main = findViewById(R.id.main);
        sn = findViewById(R.id.sn);

        home = findViewById(R.id.home);

        item_2_title = findViewById(R.id.item_2_title);
        item_2_view = findViewById(R.id.item_2_view);

        home.setOnClickListener(this);

        //初始化操作
        ShowFragmet(0, 0);

        sn.setText(String.format("ID:%s", ToolUtils.getMyUUID().substring(28)));

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.home:


                //获取教学楼信息
                new Get_Building_Info(this).execute(Const.IP);

                break;

        }
    }


    /**
     * 楼栋信息
     *
     * @param bean
     */
    public void CallBack_Building(Building_Entity.ResultBean bean) {

        ShowFragmet(1, bean.getBuildCode());

        String text = "教室数量: %s 间\n当前在使用教室: %s 间\n当前空闲教室: %s 间\n今日课程安排: %s 节\n今日有课班级: %s 个\n今日服务学生(人次): %s 人";
        item_2_view.removeAllViews();
        TextView textView = new TextView(this);
        textView.setTextSize(10);
        textView.setLineSpacing(10, 1);
        textView.setText(String.format(text, bean.getBuildTotel(), bean.getJsUsingTotel(), (bean.getBuildTotel()-bean.getJsUsingTotel()), bean.getKcTotel(), bean.getBjTotel(), bean.getStudentTotel()));
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

        Floor_Activity.start(this, entity.getFloor());
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

                Teacher_Entity teacher_entity = new Teacher_Entity();
                teacher_entity.setName(entity.getResult().getSkjsInfoList().get(position).getJsxm());
                teacher_entity.setGender(entity.getResult().getSkjsInfoList().get(position).getJsxb());
                teacher_entity.setNumber(entity.getResult().getSkjsInfoList().get(position).getJsgh());
                teacher_entity.setLevel(entity.getResult().getSkjsInfoList().get(position).getJszc());
                teacher_entity.setMessage(entity.getResult().getSkjsInfoList().get(position).getJsyjfx());

                EventBus.getDefault().post(teacher_entity);
                classroom_fragment.initeven(entity.getResult().getSkjsInfoList().get(position).getJsszlc(),
                        entity.getResult().getSkjsInfoList().get(position).getSkdd());
            }

        });

        EventBus.getDefault().post(entity);
        LogUtil.e(TAG, "发送数据");

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
//                left.setEnabled(true);
                home.setEnabled(true);

                transaction.show(classroom_fragment);
                break;
            default:
                break;

        }

        try {
            transaction.commit();
        }catch (IllegalStateException e){
            e.getMessage();
        }
    }

}
