package com.jiang.shoolshow.dialog;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.Window;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.view.TouchImageView;
import com.squareup.picasso.Picasso;

/**
 * Created by  jiang
 * on 2017/7/20.
 * Email: www.fangmu@qq.com
 * Phone：186 6120 1018
 * Purpose:TODO 图片
 * update：
 */
public class ShowImage_Dialog extends MyDialog {
    private static final String TAG = "ShowImage_Dialog";
    TouchImageView imageView;

    Object img;

    Activity activity;

    public ShowImage_Dialog(@NonNull Activity activity, Object img) {
        super(activity, R.style.myDialogTheme);
        this.img = img;
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window window = getWindow();
        window.setGravity(Gravity.CENTER);

        setContentView(R.layout.dialog_image);
        imageView = findViewById(R.id.dialog_image);

        if (img instanceof Bitmap) {
            imageView.setImageBitmap((Bitmap) img);
        }

        if (img instanceof String) {
            Picasso.with(activity).load(String.valueOf(img)).into(imageView);
        }

        setCanceledOnTouchOutside(true);

    }
}
