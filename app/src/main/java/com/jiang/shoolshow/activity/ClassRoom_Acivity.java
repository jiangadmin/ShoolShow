package com.jiang.shoolshow.activity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

    TextView name, type, size, have;

    ImageView img;

    ListView project;

    LinearLayout message_view;
    TextView message_title;
    RelativeLayout message_context;


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
        have = findViewById(R.id.classroom_have);
        img = findViewById(R.id.classroom_img);
        project = findViewById(R.id.classroom_project_list);

        message_view = findViewById(R.id.message_view);
        message_title = findViewById(R.id.message_title);
        message_context = findViewById(R.id.message_context);

        new Get_Classroom_Info(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, getIntent().getStringExtra(FLOOR), getIntent().getStringExtra(ROOM));

        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    /**
     * 数据返回
     *
     * @param bean
     */
    public void CallBack(final ClassRoom_Entity.ResultBean bean) {

        if (bean != null && bean.getJsCurrentDayKc().size() > 0) {
            name.setText(bean.getJsCurrentDayKc().get(0).getSkdd());
            type.setText(String.format("教室类型: %s", bean.getJsCurrentDayKc().get(0).getJslx()));
            size.setText(String.format("教室容量: %s 人", bean.getJsCurrentDayKc().get(0).getJszws()));
            have.setText("教室配备: ");

            if (bean.getJsCurrentDayKc().get(0).getJslx().contains("多媒体")) {
                img.setImageResource(R.mipmap.icon_classroom_media);
            }
            if (bean.getJsCurrentDayKc().get(0).getJslx().contains("阶梯教室")) {
                img.setImageResource(R.mipmap.icon_classroom_ladder);
            }
            if (bean.getJsCurrentDayKc().get(0).getJslx().contains("普通")) {
                img.setImageResource(R.mipmap.icon_classroom_routine);
            }

            Project_Adapter adapter = new Project_Adapter(this);
            adapter.setResultBean(bean);

            project.setAdapter(adapter);

            project.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    View v = View.inflate(ClassRoom_Acivity.this, R.layout.view_teacher, null);

                    ImageView head = v.findViewById(R.id.teacher_head);
                    TextView name = v.findViewById(R.id.teacher_name);
                    TextView gender = v.findViewById(R.id.teacher_gender);
                    TextView number = v.findViewById(R.id.teacher_number);
                    TextView level = v.findViewById(R.id.teacher_level);
                    TextView message = v.findViewById(R.id.message);

                    name.setText(String.format("姓名：%s", bean.getJsCurrentDayKc().get(position).getJsxm()));
                    gender.setText(String.format("性别：%s",  bean.getJsCurrentDayKc().get(position).getJsxb()));
                    number.setText(String.format("工号：%s",  bean.getJsCurrentDayKc().get(position).getJsgh()));
                    level.setText(String.format("职称：%s",  bean.getJsCurrentDayKc().get(position).getJszc()));
                    message.setText(String.format("研究方向：\n%s",  bean.getJsCurrentDayKc().get(position).getJsyjfx()));

                    message_context.addView(v);
                    message_title.setText("教师介绍");
                    message_view.setVisibility(View.VISIBLE);

                }
            });
        }
    }
}
