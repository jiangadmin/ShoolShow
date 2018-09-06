package com.jiang.shoolshow.view;

import android.content.Context;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.entity.Weather_Entity;
import com.jiang.shoolshow.servlet.Get_Weather;

public class WeatherView extends RelativeLayout {
    private static final String TAG = "WeatherView";

    private View view;
    private final Context context;

    ImageView imgWeather;
    private TextView tvTemperature, tvWeather;

    private final Handler timeHandle = new Handler();

    private final Runnable timeRun = new Runnable() {

        public void run() {
            //获取天气
            new Get_Weather(WeatherView.this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);

            timeHandle.postDelayed(this, 60 * 60 * 1000);
        }

    };

    public WeatherView(Context context) {
        super(context);
        this.context = context;
        initTitleView();
    }

    public WeatherView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initTitleView();
    }

    public void initTitleView() {

        view = LayoutInflater.from(context).inflate(R.layout.view_weather, this, true);
        imgWeather = view.findViewById(R.id.imgWeather);
        tvTemperature = view.findViewById(R.id.tvTemperature);
        tvWeather = view.findViewById(R.id.tvWeather);

        timeHandle.post(timeRun);


    }

    /**
     * 天气数据返回
     *
     * @param bean
     */
    public void Callback(Weather_Entity.ResultBean bean) {
        tvWeather.setText(bean.getWeather());
        tvTemperature.setText(bean.getTemperature());

        int Resource = -1;

        switch (bean.getWeather()) {
            case "晴":
                Resource = R.drawable.ic_weacther_01;
                break;
            case "阴":
                Resource = R.drawable.ic_weacther_02;
                break;
            case "多云":
                Resource = R.drawable.ic_weacther_04;
                break;
            case "小雨":
                Resource = R.drawable.ic_weacther_05;
                break;
            case "中雨":
                Resource = R.drawable.ic_weacther_06;
                break;
            case "大雨":
                Resource = R.drawable.ic_weacther_07;
                break;
            case "阵雨":
                Resource = R.drawable.ic_weacther_zy;
                break;
            case "暴雨":
                Resource = R.drawable.ic_weacther_by;
                break;
            case "雾":
                Resource = R.drawable.ic_weacther_w;
                break;
            case "霾":
                Resource = R.drawable.ic_weacther_m;
                break;
            case "霜冻":
                Resource = R.drawable.ic_weacther_sd;
                break;
            case "暴风":
                Resource = R.drawable.ic_weacther_bf;
                break;
            case "台风":
                Resource = R.drawable.ic_weacther_tf;
                break;
            case "暴风雪":
                Resource = R.drawable.ic_weacther_bfx;
                break;
            case "小雪":
                Resource = R.drawable.ic_weacther_xx;
                break;
            case "中雪":
                Resource = R.drawable.ic_weacther_zx;
                break;
            case "大雪":
                Resource = R.drawable.ic_weacther_dx;
                break;
            case "雨夹雪":
                Resource = R.drawable.ic_weacther_yjx;
                break;
            case "冰雹":
                Resource = R.drawable.ic_weacther_bb;
                break;
            default:
                Resource = R.drawable.ic_weacther_02;
                break;

        }

        imgWeather.setImageResource(Resource);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

}
