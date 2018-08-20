package com.jiang.shoolshow.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;

import com.jiang.shoolshow.R;

/**
 * @author: jiangyao
 * @date: 2018/8/19
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO:
 */
public class Web_Acivity extends Base_Activity {
    private static final String TAG = "Web_Acivity";
    private static final String WEBCODE = "WebCode";

    WebView webView;

    public static void start(Context context, String s) {
        Intent intent = new Intent();
        intent.setClass(context, Web_Acivity.class);
        intent.putExtra(WEBCODE, s);
        context.startActivity(intent);

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);


        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        initView();

    }

    private void initView() {
        webView = findViewById(R.id.web);

        webView.setBackgroundColor(0);

        //能够的调用JavaScript代码
        webView.getSettings().setJavaScriptEnabled(true);

        webView.getSettings().setDefaultTextEncodingName("utf-8");

        String s = getIntent().getStringExtra(WEBCODE);
        webView.loadUrl(getIntent().getStringExtra(WEBCODE));
        //加载HTML字符串进行显示
//        webView.loadData(getIntent().getStringExtra(WEBCODE), "text/html; charset=UTF-8", null);//这种写法可以正确解码


    }

}
