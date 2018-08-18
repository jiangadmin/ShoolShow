package com.jiang.shoolshow.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.utils.ToolUtils;

/**
 * @author: jiangadmin
 * @date: 2018/7/20
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 设置页面
 */
public class Setting_Activity extends Base_Activity {

    private static final String TAG = "Setting_Activity";

    TextView uuid;

    public static void start(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, Setting_Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        uuid = findViewById(R.id.uuid);
        uuid.setText(ToolUtils.getMyUUID());

        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
