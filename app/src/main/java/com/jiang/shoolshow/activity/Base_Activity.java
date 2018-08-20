package com.jiang.shoolshow.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jiang.shoolshow.view.SlidingLayout;

import org.greenrobot.eventbus.EventBus;

/**
 * @author: jiangadmin
 * @date: 2018/8/17
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 公共
 */
public class Base_Activity extends AppCompatActivity {
    private static final String TAG = "Base_Activity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setSystemUIVisible(false);
    }

    public void setSystemUIVisible(boolean show) {
        if (show) {
            int uiFlags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            uiFlags |= 0x00001000;
            getWindow().getDecorView().setSystemUiVisibility(uiFlags);
        } else {
            int uiFlags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN;
            uiFlags |= 0x00001000;
            getWindow().getDecorView().setSystemUiVisibility(uiFlags);
        }
    }

    @Override
    protected void onResume() {
        setSystemUIVisible(false);
        super.onResume();
    }
}
