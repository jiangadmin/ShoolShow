package com.jiang.shoolshow.servlet;

import android.app.Activity;
import android.os.AsyncTask;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.jiang.shoolshow.activity.MainActivity;
import com.jiang.shoolshow.entity.Weather_Entity;
import com.jiang.shoolshow.utils.HttpUtil;
import com.jiang.shoolshow.utils.LogUtil;
import com.jiang.shoolshow.view.WeatherView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: jiangadmin
 * @date: 2018/7/18
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 获取天气
 */
public class Get_Weather extends AsyncTask<String, Integer, Weather_Entity> {
    private static final String TAG = "Get_Weather";

    private WeatherView view;

    public Get_Weather(WeatherView view) {
        this.view = view;
    }

    @Override
    protected Weather_Entity doInBackground(String... strings) {
        Map map = new HashMap();
        map.put("key", "26e42ff85c1b4");
        map.put("city", "栖霞");
        map.put("province", "南京");
        String res = HttpUtil.doGet("http://apicloud.mob.com/v1/weather/query", map);

        Weather_Entity entity;

        if (TextUtils.isEmpty(res)) {
            entity = new Weather_Entity();
            entity.setRetCode(-1);
        } else {
            try {
                entity = new Gson().fromJson(res, Weather_Entity.class);
            } catch (Exception e) {
                entity = new Weather_Entity();
                entity.setRetCode(-2);
                LogUtil.e(TAG, e.getMessage());
            }
        }

        return entity;
    }

    @Override
    protected void onPostExecute(Weather_Entity entity) {
        super.onPostExecute(entity);

        switch (entity.getRetCode()) {
            case 200:
               view.Callback(entity.getResult().get(0));
                break;
        }
    }
}
