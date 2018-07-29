package com.jiang.shoolshow;

import android.app.Application;
import android.content.Context;
import android.service.notification.StatusBarNotification;

import com.tencent.bugly.crashreport.CrashReport;

import org.greenrobot.eventbus.EventBus;

import java.lang.reflect.Method;

/**
 * @author: jiangadmin
 * @date: 2018/7/17
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO:
 */
public class MyApplication extends Application {

    static Context context;
    public static boolean LogShow = true;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;

        //崩溃检测
        CrashReport.initCrashReport(getApplicationContext(), "b761f87683", false);



    }

    public static Context getInstance() {
        return context;
    }

}
