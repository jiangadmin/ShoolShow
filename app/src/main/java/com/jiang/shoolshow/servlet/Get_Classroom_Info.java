package com.jiang.shoolshow.servlet;


import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.jiang.shoolshow.entity.ClassRoom_Entity;
import com.jiang.shoolshow.entity.Const;
import com.jiang.shoolshow.fragment.Classroom_Fragment;
import com.jiang.shoolshow.utils.HttpUtil;
import com.jiang.shoolshow.utils.LogUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: jiangadmin
 * @date: 2018/7/17
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 获取教室信息
 */
public class Get_Classroom_Info extends AsyncTask<String, Integer, ClassRoom_Entity> {
    private static final String TAG = "Get_Classroom_Info";

    Fragment fragment;

    public Get_Classroom_Info(Fragment fragment) {
        this.fragment = fragment;
    }

    @Override
    protected ClassRoom_Entity doInBackground(String... strings) {
        Map map = new HashMap();
        map.put("ipStr", "192.168.0.123");
        map.put("jslc", strings[0]);
        map.put("skjs", strings[1]);

        String res = HttpUtil.doGet(Const.URL + "selectJcInfoBYCodes.do", map);

        LogUtil.e(TAG, res);

        ClassRoom_Entity entity;

        if (TextUtils.isEmpty(res)) {
            entity = new ClassRoom_Entity();
            entity.setErrorcode(-1);
            entity.setErrormsg("连接服务器失败！");

        } else {
            try {
                entity = new Gson().fromJson(res, ClassRoom_Entity.class);

            } catch (Exception e) {
                entity = new ClassRoom_Entity();
                entity.setErrorcode(-2);
                entity.setErrormsg("数据解析失败！");
                LogUtil.e(TAG, e.getMessage());
            }
        }
        return entity;
    }

    @Override
    protected void onPostExecute(ClassRoom_Entity entity) {
        super.onPostExecute(entity);

        switch (entity.getErrorcode()) {
            case 1000:
                if (fragment instanceof Classroom_Fragment) {
                    ((Classroom_Fragment) fragment).CallBack(entity.getResult());
                }
                break;
        }

    }
}
