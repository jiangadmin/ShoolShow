package com.jiang.shoolshow.servlet;

import android.app.Activity;
import android.os.AsyncTask;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.jiang.shoolshow.MainActivity;
import com.jiang.shoolshow.entity.Building_Entity;
import com.jiang.shoolshow.entity.Const;
import com.jiang.shoolshow.utils.HttpUtil;
import com.jiang.shoolshow.utils.LogUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: jiangadmin
 * @date: 2018/7/17
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 获取楼栋信息
 */
public class Get_Building_Info extends AsyncTask<String, Integer, Building_Entity> {
    private static final String TAG = "Get_Building_Info";

    Activity activity;

    public Get_Building_Info(Activity activity) {
        this.activity = activity;
    }

    @Override
    protected Building_Entity doInBackground(String... strings) {
        Map map = new HashMap();
        map.put("ipStr", strings[0]);

        String res = HttpUtil.doGet(Const.URL + "selectBuildingInfoByIp.do", map);

        LogUtil.e(TAG, res);

        Building_Entity entity;

        if (TextUtils.isEmpty(res)) {
            entity = new Building_Entity();
            entity.setErrorcode(-1);
            entity.setErrormsg("连接服务器失败！");

        } else {
            try {
                entity = new Gson().fromJson(res, Building_Entity.class);

            } catch (Exception e) {
                entity = new Building_Entity();
                entity.setErrorcode(-2);
                entity.setErrormsg("数据解析失败！");
                LogUtil.e(TAG, e.getMessage());
            }
        }
        return entity;
    }

    @Override
    protected void onPostExecute(Building_Entity entity) {
        super.onPostExecute(entity);

        if (activity instanceof MainActivity){
            ((MainActivity) activity).CallBack_Building(entity.getResult());
        }

    }
}
