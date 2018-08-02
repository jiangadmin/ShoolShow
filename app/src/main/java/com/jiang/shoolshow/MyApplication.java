package com.jiang.shoolshow;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.service.notification.StatusBarNotification;

import com.jiang.shoolshow.utils.LogUtil;
import com.tencent.bugly.crashreport.CrashReport;

import org.greenrobot.eventbus.EventBus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: jiangadmin
 * @date: 2018/7/17
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO:
 */
public class MyApplication extends Application {
    private static final String TAG = "MyApplication";

    static Context context;
    public static boolean LogShow = true;

    /**
     * 打开的activity
     **/
    static List<Activity> activities;

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

    /**
     * add Activity 添加Activity到栈
     */
    public static void addActivity(Activity activity) {
        if (activities == null) {
            activities = new ArrayList<>();
        }
        activities.add(activity);
    }

    /**
     * get current Activity 获取当前Activity（栈中最后一个压入的）
     */
    public static Activity currentActivity() {
        Activity activity = activities.get(activities.size() - 1);
        return activity;
    }

    /**
     * 结束当前Activity（栈中最后一个压入的）
     */
    public static void finishActivity() {
        try {
            Activity activity = activities.get(activities.size() - 1);
            finishActivity(activity);
        }catch (Exception e){
            LogUtil.e(TAG,"出错了");
        }

    }

    /**
     * 结束指定的Activity
     *
     * @param activity
     */

    public static void finishActivity(Activity activity) {
        if (activity != null) {
            activities.remove(activity);
            activity.finish();
        }
    }

    /**
     * 结束指定类名的Activity
     */
    public static void finishActivity(Class<?> cls) {
        if (activities != null) {
            for (Activity activity : activities) {
                if (activity.getClass().equals(cls)) {
                    activities.remove(activity);
                    finishActivity(activity);
                    break;
                }
            }
        }
    }

    /**
     * 查询栈中是否有这个
     * @param cls
     */
    public static boolean QueryActivity(Class<?> cls){
        if (activities != null) {
            for (Activity activity : activities) {
                if (activity.getClass().equals(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 结束所有Activity
     */
    public static void finishAllActivity() {
        for (int i = 0, size = activities.size(); i < size; i++) {
            if (null != activities.get(i)) {
                activities.get(i).finish();
            }
        }
        activities.clear();
    }

    /**
     * 退出应用程序
     */
    public static void AppExit() {
        try {
            finishAllActivity();
        } catch (Exception e) {
        }
    }

}
