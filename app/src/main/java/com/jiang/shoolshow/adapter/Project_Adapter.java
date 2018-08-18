package com.jiang.shoolshow.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.entity.ClassRoom_Entity;
import com.jiang.shoolshow.entity.Teacher_Entity;

import org.greenrobot.eventbus.EventBus;

/**
 * @author: jiangadmin
 * @date: 2018/7/26
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 课程适配器
 */
public class Project_Adapter extends BaseAdapter {
    private static final String TAG = "Project_Adapter";

    Context context;

    ClassRoom_Entity.ResultBean resultBean;

    public Project_Adapter(Context context) {
        this.context = context;
    }

    public void setResultBean(ClassRoom_Entity.ResultBean resultBean) {
        this.resultBean = resultBean;
    }

    @Override
    public int getCount() {
        return resultBean.getJsCurrentDayKc().size();
    }

    @Override
    public Object getItem(int position) {
        return resultBean.getJsCurrentDayKc().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item_project, null);
            holder = new ViewHolder();
            holder.num = convertView.findViewById(R.id.project_num);
            holder.teacher = convertView.findViewById(R.id.project_teacher);
            holder.name = convertView.findViewById(R.id.project_name);
            holder.classname = convertView.findViewById(R.id.project_class);
            holder.view = convertView.findViewById(R.id.project_view);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final ClassRoom_Entity.ResultBean.JsCurrentDayKcBean bean = resultBean.getJsCurrentDayKc().get(position);
        holder.num.setText(bean.getJc());
        holder.teacher.setText(bean.getJsxm());
        holder.name.setText(bean.getKcmc());
        holder.classname.setText(bean.getSkbjh());

        return convertView;
    }

    private class ViewHolder {
        LinearLayout view;
        TextView num, teacher, name, classname;
    }
}
