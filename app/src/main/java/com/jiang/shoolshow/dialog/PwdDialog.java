package com.jiang.shoolshow.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ImageView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.entity.Const;
import com.jiang.shoolshow.utils.SaveUtils;

/**
 * @author: jiangadmin
 * @date: 2017/7/3.
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 密码输入框
 */


public class PwdDialog extends Dialog {
    private static final String TAG = "PwdDialog";

    ImageView pwd1, pwd2, pwd3, pwd4, pwd5, pwd6;

    Activity activity;

    String password = "";

    public PwdDialog(Activity activity) {
        super(activity, R.style.MyDialog);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_password);
        initview();
    }

    private void initview() {
        pwd1 = findViewById(R.id.pwd1);
        pwd2 = findViewById(R.id.pwd2);
        pwd3 = findViewById(R.id.pwd3);
        pwd4 = findViewById(R.id.pwd4);
        pwd5 = findViewById(R.id.pwd5);
        pwd6 = findViewById(R.id.pwd6);
    }

    public void updatepwdshow(int resid, int npwd) {
        password = password + String.valueOf(npwd);
        switch (password.length()) {
            case 1:
                pwd1.setImageResource(resid);
                break;
            case 2:
                pwd2.setImageResource(resid);
                break;
            case 3:
                pwd3.setImageResource(resid);
                break;
            case 4:
                pwd4.setImageResource(resid);
                break;
            case 5:
                pwd5.setImageResource(resid);
                break;
            case 6:
                pwd6.setImageResource(resid);
                dismiss();


                if (password.equals(SaveUtils.getString(Const.Password))) {

                }

                break;
        }
    }
}