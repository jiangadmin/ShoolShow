package com.jiang.shoolshow.activity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.adapter.Project_Adapter;
import com.jiang.shoolshow.entity.ClassRoom_Entity;
import com.jiang.shoolshow.servlet.Get_Classroom_Info;
import com.squareup.picasso.Picasso;

/**
 * @author: jiangadmin
 * @date: 2018/8/17
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 教室
 */
public class ClassRoom_Acivity extends Base_Activity {
    private static final String TAG = "ClassRoom_Acivity";
    private static final String FLOOR = "floor";
    private static final String ROOM = "room";

    TextView name, type, size;

    ImageView img;

    ListView project;

    LinearLayout message_view;
    TextView message_title;
    RelativeLayout message_context;

    TimeCount timeCount;

    public static void start(Context context, String floor, String room) {
        Intent intent = new Intent();
        intent.setClass(context, ClassRoom_Acivity.class);
        intent.putExtra(FLOOR, floor);
        intent.putExtra(ROOM, room);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classroom);

        name = findViewById(R.id.classroom_name);
        type = findViewById(R.id.classroom_type);
        size = findViewById(R.id.classroom_size);
        img = findViewById(R.id.classroom_img);
        project = findViewById(R.id.classroom_project_list);

        message_view = findViewById(R.id.message_view);
        message_title = findViewById(R.id.message_title);
        message_context = findViewById(R.id.message_context);

        //获取教室信息
        new Get_Classroom_Info(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, getIntent().getStringExtra(FLOOR), getIntent().getStringExtra(ROOM));

        timeCount = new TimeCount(2 * 60 * 1000, 1000);
        timeCount.start();

        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    /**
     * 计时器
     */
    class TimeCount extends CountDownTimer {
        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);//参数依次为总时长,和计时的时间间隔
        }

        //倒计时完成
        @Override
        public void onFinish() {
            //再次启动
            new Get_Classroom_Info(ClassRoom_Acivity.this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, getIntent().getStringExtra(FLOOR), getIntent().getStringExtra(ROOM));
        }

        @Override
        public void onTick(long millisUntilFinished) {//计时过程显示

        }
    }

    ImageView head;
    TextView tname;
    TextView gender;
    TextView number;
    TextView level;
    TextView message;

    /**
     * 数据返回
     *
     * @param bean
     */
    public void CallBack(final ClassRoom_Entity.ResultBean bean) {

        if (bean.getJsInfo() != null) {
            name.setText(bean.getJsInfo().getSkdd());
            type.setText(String.format("教室类型: %s", bean.getJsInfo().getJslx()));
            size.setText(String.format("教室容量: %s 人", bean.getJsInfo().getJszws()));

//            if (bean.getJsInfo().getJslx().contains("多媒体")) {
//                img.setImageResource(R.mipmap.icon_classroom_media);
//            }
//            if (bean.getJsInfo().getJslx().contains("阶梯教室")) {
//                img.setImageResource(R.mipmap.icon_classroom_ladder);
//            }
//            if (bean.getJsInfo().getJslx().contains("普通")) {
//                img.setImageResource(R.mipmap.icon_classroom_routine);
//            }

        }
        message_context.removeAllViews();

        View v = View.inflate(this, R.layout.view_teacher, null);

        head = v.findViewById(R.id.teacher_head);
        tname = v.findViewById(R.id.teacher_name);
        gender = v.findViewById(R.id.teacher_gender);
        number = v.findViewById(R.id.teacher_number);
        level = v.findViewById(R.id.teacher_level);
        message = v.findViewById(R.id.message);

        tname.setText("姓名：");
        gender.setText("性别：");
        number.setText("工号：");
        level.setText("职称：");
        message.setText("研究方向：");

        message_context.addView(v);
        message_title.setText("教师介绍");
        message_view.setVisibility(View.VISIBLE);

        if (bean != null && bean.getJsCurrentDayKc().size() > 0) {

            for (ClassRoom_Entity.ResultBean.JsCurrentDayKcBean kcBean : bean.getJsCurrentDayKc()) {
                if (kcBean.getJc().contains(bean.getJc())) {
                    ShowTeacher(kcBean);
                }
            }


            Project_Adapter adapter = new Project_Adapter(this);
            adapter.setResultBean(bean);

            project.setAdapter(adapter);

            project.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    ShowTeacher(bean.getJsCurrentDayKc().get(position));


                }
            });
        }
    }

    public void ShowTeacher(ClassRoom_Entity.ResultBean.JsCurrentDayKcBean bean) {
        if (!TextUtils.isEmpty(bean.getZp())) {
            Picasso.with(ClassRoom_Acivity.this).load(bean.getZp()).into(head);
        } else {
            head.setImageBitmap(null);
        }
        tname.setText(String.format("姓名：%s", bean.getJsxm()));
        gender.setText(String.format("性别：%s", bean.getJsxb()));
        number.setText(String.format("工号：%s", bean.getJsgh()));
        level.setText(String.format("职称：%s", bean.getJszc()));
        message.setText(String.format("研究方向：\n%s", bean.getJsyjfx()));
    }
}
