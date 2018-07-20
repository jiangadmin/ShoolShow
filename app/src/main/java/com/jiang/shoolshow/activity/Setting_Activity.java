package com.jiang.shoolshow.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jiang.shoolshow.R;

/**
 * @author: jiangadmin
 * @date: 2018/7/20
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 设置页面
 */
public class Setting_Activity extends AppCompatActivity{

    private static final String TAG = "Setting_Activity";

    public static void start(Context context) {
        Intent intent = new Intent();
        intent.setClass(context,Setting_Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        initview();
    }

    private void initview() {

    }
}
