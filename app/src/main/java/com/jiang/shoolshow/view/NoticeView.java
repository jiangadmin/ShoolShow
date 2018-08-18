package com.jiang.shoolshow.view;

import android.content.Context;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.activity.Setting_Activity;
import com.jiang.shoolshow.entity.Banner_Entity;
import com.jiang.shoolshow.entity.Notice_Entity;
import com.jiang.shoolshow.servlet.Get_Notice_Info;
import com.jiang.shoolshow.utils.LogUtil;
import com.jiang.shoolshow.utils.ToolUtils;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoticeView extends RelativeLayout {
    private static final String TAG = "WeatherView";

    private View view;
    private final Context context;

    private TextView tvTitle;

    RelativeLayout tvContext;

    private final Handler timeHandle = new Handler();

    private final Runnable timeRun = new Runnable() {

        public void run() {
            //获取天气
            new Get_Notice_Info(NoticeView.this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);

            timeHandle.postDelayed(this, 10 * 60 * 1000);
        }

    };

    public NoticeView(Context context) {
        super(context);
        this.context = context;
        initTitleView();
    }

    public NoticeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initTitleView();
    }

    public void initTitleView() {

        view = LayoutInflater.from(context).inflate(R.layout.view_notice, this, true);
        tvTitle = view.findViewById(R.id.notice_title);
        tvContext = view.findViewById(R.id.notice_context);

        timeHandle.post(timeRun);

    }

    /**
     * 天气数据返回
     *
     * @param bean
     */
    public void Callback(Notice_Entity.ResultBean bean) {

        switch (bean.getNoticeType()) {

            //文字
            case 1:
                TextView textView = new TextView(context);
                textView.setText(bean.getContent());
                tvContext.addView(textView);
                break;

            //图片
            case 2:
                tvContext.removeAllViews();
                List<String> result = Arrays.asList(bean.getImagelist().split(","));
                ImageCycleView imageCycleView = new ImageCycleView(context);

                Banner_Entity banner_entity = new Banner_Entity();
                List<Banner_Entity.DBean> dBeans = new ArrayList<>();
                banner_entity.setD(dBeans);
                for (String s : result) {
                    Banner_Entity.DBean dBean = new Banner_Entity.DBean();
                    dBean.setPicUrl(s);
                    dBean.setDesc(bean.getContent());
                    dBeans.add(dBean);
                }

                imageCycleView.setBeans(banner_entity.getD(), new ImageCycleView.Listener() {
                    @Override
                    public void displayImage(String imageURL, ImageView imageView) {
                        Picasso.with(context).load(imageURL).into(imageView);
                    }

                    @Override
                    public void onImageClick(Banner_Entity.DBean bean, View imageView) {
                        if (bean.getDesc().equals("<Setting>")){

                        }
                        Setting_Activity.start(context);
                        LogUtil.e(TAG,bean.getDesc());
                    }
                });

                tvContext.addView(imageCycleView);

                break;
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

}
