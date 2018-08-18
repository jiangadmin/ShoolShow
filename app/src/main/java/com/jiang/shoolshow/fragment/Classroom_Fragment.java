package com.jiang.shoolshow.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.adapter.Project_Adapter;
import com.jiang.shoolshow.entity.ClassRoom_Entity;
import com.jiang.shoolshow.entity.Floor_Entity;
import com.jiang.shoolshow.servlet.Get_Classroom_Info;

/**
 * @author: jiangadmin
 * @date: 2018/7/20
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 教室
 */
public class Classroom_Fragment extends Fragment {
    private static final String TAG = "Classroom_Fragment";

    TextView name, type, size, have;

    ImageView img;

    ListView project;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_classroom, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        name = view.findViewById(R.id.classroom_name);
        type = view.findViewById(R.id.classroom_type);
        size = view.findViewById(R.id.classroom_size);
        have = view.findViewById(R.id.classroom_have);
        img = view.findViewById(R.id.classroom_img);
        project = view.findViewById(R.id.classroom_project_list);

    }

    public void initeven(String floor, String room) {
//        new Get_Classroom_Info(this).execute(floor, room);
    }

    /**
     * 数据返回
     *
     * @param bean
     */
    public void CallBack(ClassRoom_Entity.ResultBean bean) {

        if (bean != null && bean.getJsCurrentDayKc().size() > 0) {
            name.setText(bean.getJsCurrentDayKc().get(0).getSkdd());
            type.setText(String.format("教室类型: %s", bean.getJsCurrentDayKc().get(0).getJslx()));
            size.setText(String.format("教室容量: %s 人", bean.getJsCurrentDayKc().get(0).getJszws()));
            have.setText("教室配备: ");

            Project_Adapter adapter = new Project_Adapter(getActivity());
            adapter.setResultBean(bean);

            project.setAdapter(adapter);
        }
    }
}
