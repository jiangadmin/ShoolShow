package com.jiang.shoolshow.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
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
    Button setting1,setting2;

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
        setting1 = findViewById(R.id.settinng_1);
        setting2 = findViewById(R.id.settinng_2);
        uuid.setText(ToolUtils.getMyUUID());

        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        setting1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getPackageManager().getLaunchIntentForPackage("com.teamhd.settings")));
            }
        });
        setting2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getPackageManager().getLaunchIntentForPackage("com.android.settings")));
            }
        });
    }

}
