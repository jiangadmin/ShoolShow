package com.jiang.shoolshow.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.entity.Floor_Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jiangadmin
 * @date: 2018/7/19
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 课程信息
 */
public class Floor_Info_Adapter extends BaseAdapter {
    private static final String TAG = "Floor_Info_Adapter";

    Context context;

    List<Floor_Entity.ResultBean.SkjsInfoListBean> resultBeans = new ArrayList<>();

    public Floor_Info_Adapter(Context context) {
        this.context = context;
    }

    public void setResultBeans(List<Floor_Entity.ResultBean.SkjsInfoListBean> resultBeans) {
        this.resultBeans = resultBeans;
    }

    @Override
    public int getCount() {
        return resultBeans.size();
    }

    @Override
    public Object getItem(int position) {
        return resultBeans.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item_classroom, null);
            holder = new ViewHolder();
            holder.id = convertView.findViewById(R.id.item_room_id);
            holder.project_time = convertView.findViewById(R.id.item_project_time);
            holder.teacher_name = convertView.findViewById(R.id.item_teacher_name);
            holder.project = convertView.findViewById(R.id.item_project);
            holder.grade = convertView.findViewById(R.id.item_grade);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Floor_Entity.ResultBean.SkjsInfoListBean bean = resultBeans.get(position);

        holder.id.setText( bean.getSkdd().substring(3));
        holder.project_time.setText(bean.getJc());
        holder.teacher_name.setText(bean.getJsxm());
        holder.project.setText(bean.getKcmc());
        holder.grade.setText(bean.getSkbjh());

        return convertView;
    }

    private class ViewHolder {
        TextView id, project_time, teacher_name, project, grade;
    }
}
