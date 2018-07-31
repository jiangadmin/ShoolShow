package com.jiang.shoolshow.servlet;

import android.app.Activity;
import android.os.AsyncTask;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.jiang.shoolshow.activity.MainActivity;
import com.jiang.shoolshow.entity.Const;
import com.jiang.shoolshow.entity.Floor_Entity;
import com.jiang.shoolshow.utils.HttpUtil;
import com.jiang.shoolshow.utils.LogUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: jiangadmin
 * @date: 2018/7/17
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 获取楼层信息
 */
public class Get_Floor_Info extends AsyncTask<String, Integer, Floor_Entity> {
    private static final String TAG = "Get_Floor_Info";

    Activity activity;

    public Get_Floor_Info(Activity activity) {
        this.activity = activity;
    }

    @Override
    protected Floor_Entity doInBackground(String... strings) {
        Map map = new HashMap();
        map.put("ipStr", strings[0]);
        map.put("jslc", strings[1]);

        String res = HttpUtil.doGet(Const.URL + "selectBuildingLcInfoByCodes.do", map);

        LogUtil.e(TAG, res);

        Floor_Entity entity;

        if (TextUtils.isEmpty(res)) {
            entity = new Floor_Entity();
            entity.setErrorcode(-1);
            entity.setErrormsg("连接服务器失败！");

        } else {
            try {
                entity = new Gson().fromJson(res, Floor_Entity.class);

            } catch (Exception e) {
                entity = new Floor_Entity();
                entity.setErrorcode(-2);
                entity.setErrormsg("数据解析失败！");
                LogUtil.e(TAG, e.getMessage());
            }
        }
        return entity;
    }

    @Override
    protected void onPostExecute(Floor_Entity entity) {
        super.onPostExecute(entity);

        switch (entity.getErrorcode()){
            case 1000:
                if (activity instanceof MainActivity) {
                    ((MainActivity) activity).CallBack_Floor(entity.getResult());
                }
                break;
        }
    }
}
