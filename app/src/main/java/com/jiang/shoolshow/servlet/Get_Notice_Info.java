package com.jiang.shoolshow.servlet;

import android.os.AsyncTask;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.jiang.shoolshow.activity.MainActivity;
import com.jiang.shoolshow.entity.Base_Entity;
import com.jiang.shoolshow.entity.Notice_Entity;
import com.jiang.shoolshow.utils.HttpUtil;
import com.jiang.shoolshow.utils.LogUtil;
import com.jiang.shoolshow.view.NoticeView;

import org.greenrobot.eventbus.EventBus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: jiangyao
 * @date: 2018/8/16
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 公告栏
 */
public class Get_Notice_Info extends AsyncTask<String, Integer, Notice_Entity> {
    private static final String TAG = "Get_Notice_Info";

    NoticeView view;

    public Get_Notice_Info(NoticeView view) {
        this.view = view;
    }

    @Override
    protected Notice_Entity doInBackground(String... strings) {

        Map map  = new HashMap();

        String res = HttpUtil.doGet("http://202.119.226.230:8080/teach_app_api/cms/noticeController/queryCurrtNotice.do", map);

        LogUtil.e(TAG, res);

        Notice_Entity entity;

        if (TextUtils.isEmpty(res)) {
            entity = new Notice_Entity();
            entity.setErrorcode(-1);
            entity.setErrormsg("连接服务器失败！");

        } else {
            try {
                entity = new Gson().fromJson(res, Notice_Entity.class);

            } catch (Exception e) {
                entity = new Notice_Entity();
                entity.setErrorcode(-2);
                entity.setErrormsg("数据解析失败！");
                LogUtil.e(TAG, e.getMessage());
            }
        }
        return entity;
    }

    @Override
    protected void onPostExecute(Notice_Entity entity) {
        super.onPostExecute(entity);
        switch (entity.getErrorcode()){
            case 1000:
                view.Callback(entity);
                break;
        }
    }
}
