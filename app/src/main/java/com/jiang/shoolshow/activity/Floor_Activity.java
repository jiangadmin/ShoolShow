package com.jiang.shoolshow.activity;

import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.adapter.Floor_Info_Adapter;
import com.jiang.shoolshow.entity.Const;
import com.jiang.shoolshow.entity.Floor_Entity;
import com.jiang.shoolshow.fragment.Floor_11_Fragment;
import com.jiang.shoolshow.fragment.Floor_12_Fragment;
import com.jiang.shoolshow.fragment.Floor_13_Fragment;
import com.jiang.shoolshow.fragment.Floor_14_Fragment;
import com.jiang.shoolshow.fragment.Floor_15_Fragment;
import com.jiang.shoolshow.fragment.Floor_21_Fragment;
import com.jiang.shoolshow.fragment.Floor_22_Fragment;
import com.jiang.shoolshow.fragment.Floor_23_Fragment;
import com.jiang.shoolshow.fragment.Floor_24_Fragment;
import com.jiang.shoolshow.fragment.Floor_25_Fragment;
import com.jiang.shoolshow.fragment.Floor_31_Fragment;
import com.jiang.shoolshow.fragment.Floor_32_Fragment;
import com.jiang.shoolshow.fragment.Floor_33_Fragment;
import com.jiang.shoolshow.fragment.Floor_34_Fragment;
import com.jiang.shoolshow.fragment.Floor_35_Fragment;
import com.jiang.shoolshow.fragment.Floor_36_Fragment;
import com.jiang.shoolshow.fragment.Floor_41_Fragment;
import com.jiang.shoolshow.fragment.Floor_42_Fragment;
import com.jiang.shoolshow.fragment.Floor_43_Fragment;
import com.jiang.shoolshow.fragment.Floor_44_Fragment;
import com.jiang.shoolshow.fragment.Floor_45_Fragment;
import com.jiang.shoolshow.fragment.Floor_46_Fragment;
import com.jiang.shoolshow.servlet.Get_Floor_Info;
import com.jiang.shoolshow.utils.LogUtil;
import com.jiang.shoolshow.view.ListViewForScrollView;

import org.greenrobot.eventbus.EventBus;

/**
 * @author: jiangadmin
 * @date: 2018/8/17
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 楼层
 */
public class Floor_Activity extends Base_Activity {
    private static final String TAG = "Floor_Activity";
    private static final String FLOOR = "floor";

    Floor_11_Fragment floor_11_fragment;
    Floor_12_Fragment floor_12_fragment;
    Floor_13_Fragment floor_13_fragment;
    Floor_14_Fragment floor_14_fragment;
    Floor_15_Fragment floor_15_fragment;

    Floor_21_Fragment floor_21_fragment;
    Floor_22_Fragment floor_22_fragment;
    Floor_23_Fragment floor_23_fragment;
    Floor_24_Fragment floor_24_fragment;
    Floor_25_Fragment floor_25_fragment;

    Floor_31_Fragment floor_31_fragment;
    Floor_32_Fragment floor_32_fragment;
    Floor_33_Fragment floor_33_fragment;
    Floor_34_Fragment floor_34_fragment;
    Floor_35_Fragment floor_35_fragment;
    Floor_36_Fragment floor_36_fragment;

    Floor_41_Fragment floor_41_fragment;
    Floor_42_Fragment floor_42_fragment;
    Floor_43_Fragment floor_43_fragment;
    Floor_44_Fragment floor_44_fragment;
    Floor_45_Fragment floor_45_fragment;
    Floor_46_Fragment floor_46_fragment;

    LinearLayout message_view;
    TextView message_title;
    RelativeLayout message_context;

    int floor = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor);

        floor = getIntent().getIntExtra(FLOOR, 0);
        ShowFragmet(floor);

        new Get_Floor_Info(this, floor).execute(Const.IP, String.valueOf(floor % 10));

        new TimeCount(2 * 60 * 1000, 1000).start();

        message_view = findViewById(R.id.message_view);
        message_title = findViewById(R.id.message_title);
        message_context = findViewById(R.id.message_context);

        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public static void start(Context context, int vid) {
        Intent intent = new Intent();
        intent.setClass(context, Floor_Activity.class);
        intent.putExtra(FLOOR, vid);
        context.startActivity(intent);
    }

    /**
     * 计时器
     */
    class TimeCount extends CountDownTimer {
        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);//参数依次为总时长,和计时的时间间隔
        }

        //倒计时完成
        @Override
        public void onFinish() {
            //再次启动
            new Get_Floor_Info(Floor_Activity.this, floor).execute(Const.IP, String.valueOf(floor % 10));
        }

        @Override
        public void onTick(long millisUntilFinished) {//计时过程显示

        }
    }

    /**
     * 控制二级显示
     *
     * @param vid
     */
    public void ShowFragmet(int vid) {
        FragmentTransaction floortion = getFragmentManager().beginTransaction();

        if (floor_11_fragment == null) {
            floor_11_fragment = new Floor_11_Fragment();
            floortion.add(R.id.main, floor_11_fragment);
        }
        if (floor_12_fragment == null) {
            floor_12_fragment = new Floor_12_Fragment();
            floortion.add(R.id.main, floor_12_fragment);
        }
        if (floor_13_fragment == null) {
            floor_13_fragment = new Floor_13_Fragment();
            floortion.add(R.id.main, floor_13_fragment);
        }
        if (floor_14_fragment == null) {
            floor_14_fragment = new Floor_14_Fragment();
            floortion.add(R.id.main, floor_14_fragment);
        }
        if (floor_15_fragment == null) {
            floor_15_fragment = new Floor_15_Fragment();
            floortion.add(R.id.main, floor_15_fragment);
        }

        if (floor_21_fragment == null) {
            floor_21_fragment = new Floor_21_Fragment();
            floortion.add(R.id.main, floor_21_fragment);
        }
        if (floor_22_fragment == null) {
            floor_22_fragment = new Floor_22_Fragment();
            floortion.add(R.id.main, floor_22_fragment);
        }
        if (floor_23_fragment == null) {
            floor_23_fragment = new Floor_23_Fragment();
            floortion.add(R.id.main, floor_23_fragment);
        }
        if (floor_24_fragment == null) {
            floor_24_fragment = new Floor_24_Fragment();
            floortion.add(R.id.main, floor_24_fragment);
        }
        if (floor_25_fragment == null) {
            floor_25_fragment = new Floor_25_Fragment();
            floortion.add(R.id.main, floor_25_fragment);
        }

        if (floor_31_fragment == null) {
            floor_31_fragment = new Floor_31_Fragment();
            floortion.add(R.id.main, floor_31_fragment);
        }
        if (floor_32_fragment == null) {
            floor_32_fragment = new Floor_32_Fragment();
            floortion.add(R.id.main, floor_32_fragment);
        }
        if (floor_33_fragment == null) {
            floor_33_fragment = new Floor_33_Fragment();
            floortion.add(R.id.main, floor_33_fragment);
        }
        if (floor_34_fragment == null) {
            floor_34_fragment = new Floor_34_Fragment();
            floortion.add(R.id.main, floor_34_fragment);
        }
        if (floor_35_fragment == null) {
            floor_35_fragment = new Floor_35_Fragment();
            floortion.add(R.id.main, floor_35_fragment);
        }
        if (floor_36_fragment == null) {
            floor_36_fragment = new Floor_36_Fragment();
            floortion.add(R.id.main, floor_36_fragment);
        }

        if (floor_41_fragment == null) {
            floor_41_fragment = new Floor_41_Fragment();
            floortion.add(R.id.main, floor_41_fragment);
        }
        if (floor_42_fragment == null) {
            floor_42_fragment = new Floor_42_Fragment();
            floortion.add(R.id.main, floor_42_fragment);
        }
        if (floor_43_fragment == null) {
            floor_43_fragment = new Floor_43_Fragment();
            floortion.add(R.id.main, floor_43_fragment);
        }
        if (floor_44_fragment == null) {
            floor_44_fragment = new Floor_44_Fragment();
            floortion.add(R.id.main, floor_44_fragment);
        }
        if (floor_45_fragment == null) {
            floor_45_fragment = new Floor_45_Fragment();
            floortion.add(R.id.main, floor_45_fragment);
        }
        if (floor_46_fragment == null) {
            floor_46_fragment = new Floor_46_Fragment();
            floortion.add(R.id.main, floor_46_fragment);
        }

        floortion.hide(floor_11_fragment);
        floortion.hide(floor_12_fragment);
        floortion.hide(floor_13_fragment);
        floortion.hide(floor_14_fragment);
        floortion.hide(floor_15_fragment);

        floortion.hide(floor_21_fragment);
        floortion.hide(floor_22_fragment);
        floortion.hide(floor_23_fragment);
        floortion.hide(floor_24_fragment);
        floortion.hide(floor_25_fragment);

        floortion.hide(floor_31_fragment);
        floortion.hide(floor_32_fragment);
        floortion.hide(floor_33_fragment);
        floortion.hide(floor_34_fragment);
        floortion.hide(floor_35_fragment);
        floortion.hide(floor_36_fragment);

        floortion.hide(floor_41_fragment);
        floortion.hide(floor_42_fragment);
        floortion.hide(floor_43_fragment);
        floortion.hide(floor_44_fragment);
        floortion.hide(floor_45_fragment);
        floortion.hide(floor_46_fragment);

        switch (vid) {
            case 11:
                floortion.show(floor_11_fragment);
                break;
            case 12:
                floortion.show(floor_12_fragment);
                break;
            case 13:
                floortion.show(floor_13_fragment);
                break;
            case 14:
                floortion.show(floor_14_fragment);
                break;
            case 15:
                floortion.show(floor_15_fragment);
                break;

            case 21:
                floortion.show(floor_21_fragment);
                break;
            case 22:
                floortion.show(floor_22_fragment);
                break;
            case 23:
                floortion.show(floor_23_fragment);
                break;
            case 24:
                floortion.show(floor_24_fragment);
                break;
            case 25:
                floortion.show(floor_25_fragment);
                break;

            case 31:
                floortion.show(floor_31_fragment);
                break;
            case 32:
                floortion.show(floor_32_fragment);
                break;
            case 33:
                floortion.show(floor_33_fragment);
                break;
            case 34:
                floortion.show(floor_34_fragment);
                break;
            case 35:
                floortion.show(floor_35_fragment);
                break;
            case 36:
                floortion.show(floor_36_fragment);
                break;

            case 41:
                floortion.show(floor_41_fragment);
                break;
            case 42:
                floortion.show(floor_42_fragment);
                break;
            case 43:
                floortion.show(floor_43_fragment);
                break;
            case 44:
                floortion.show(floor_44_fragment);
                break;
            case 45:
                floortion.show(floor_45_fragment);
                break;
            case 46:
                floortion.show(floor_46_fragment);
                break;

            default:
                break;
        }

        floortion.commit();
    }

    /**
     * 楼层信息
     *
     * @param entity
     */
    public void CallBack_Floor(final Floor_Entity entity) {

        if (entity.getResult().getSkjsInfoList() != null && entity.getResult().getSkjsInfoList().size() > 0) {
            ListViewForScrollView listViewForScrollView = new ListViewForScrollView(this);
            message_view.setVisibility(View.VISIBLE);
            Floor_Info_Adapter adapter = new Floor_Info_Adapter(this);
            adapter.setResultBeans(entity.getResult().getSkjsInfoList());

            listViewForScrollView.setAdapter(adapter);

            message_context.addView(listViewForScrollView);

            listViewForScrollView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    ClassRoom_Acivity.start(Floor_Activity.this, String.valueOf(floor % 10), entity.getResult().getSkjsInfoList().get(position).getSkdd());

                }

            });
        }

        EventBus.getDefault().post(entity);
        LogUtil.e(TAG, "发送数据");

    }

}
