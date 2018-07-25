package com.jiang.shoolshow.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.jiang.shoolshow.R;
import com.jiang.shoolshow.activity.Setting_Activity;

/**
 * @author: jiangadmin
 * @date: 2017/7/3.
 * @Email: www.fangmu@qq.com
 * @Phone: 186 6120 1018
 * TODO: 密码输入框
 */

public class PwdDialog extends Dialog implements View.OnClickListener {
    private static final String TAG = "PwdDialog";

    ImageView esc, pwd1, pwd2, pwd3, pwd4, pwd5, pwd6, pwd7, pwd8;

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn12, btn11;

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
        initeven();
    }


    private void initview() {
        esc = findViewById(R.id.dialog_back);

        pwd1 = findViewById(R.id.pwd1);
        pwd2 = findViewById(R.id.pwd2);
        pwd3 = findViewById(R.id.pwd3);
        pwd4 = findViewById(R.id.pwd4);
        pwd5 = findViewById(R.id.pwd5);
        pwd6 = findViewById(R.id.pwd6);
        pwd7 = findViewById(R.id.pwd7);
        pwd8 = findViewById(R.id.pwd8);

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);

        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);

        btn11 = findViewById(R.id.btn_11);
        btn0 = findViewById(R.id.btn_0);
        btn12 = findViewById(R.id.btn_12);

    }

    private void initeven() {
        esc.setOnClickListener(this);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btn11.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn12.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.dialog_back:
                dismiss();
                break;
            case R.id.btn_1:
                password += "1";
                break;
            case R.id.btn_2:
                password += "2";
                break;
            case R.id.btn_3:
                password += "3";
                break;
            case R.id.btn_4:
                password += "4";
                break;
            case R.id.btn_5:
                password += "5";
                break;
            case R.id.btn_6:
                password += "6";
                break;
            case R.id.btn_7:
                password += "7";
                break;
            case R.id.btn_8:
                password += "8";
                break;
            case R.id.btn_9:
                password += "9";
                break;
            case R.id.btn_0:
                password += "0";
                break;
            case R.id.btn_11:
                password = "";
                break;
            case R.id.btn_12:
                password = password.substring(0, password.length() - 1);
                break;

        }

        pwd1.setImageResource(R.drawable.ic_round_f);
        pwd2.setImageResource(R.drawable.ic_round_f);
        pwd3.setImageResource(R.drawable.ic_round_f);
        pwd4.setImageResource(R.drawable.ic_round_f);
        pwd5.setImageResource(R.drawable.ic_round_f);
        pwd6.setImageResource(R.drawable.ic_round_f);
        pwd7.setImageResource(R.drawable.ic_round_f);
        pwd8.setImageResource(R.drawable.ic_round_f);

        switch (password.length()) {
            case 8:
                pwd8.setImageResource(R.drawable.ic_round_n);
            case 7:
                pwd7.setImageResource(R.drawable.ic_round_n);
            case 6:
                pwd6.setImageResource(R.drawable.ic_round_n);
            case 5:
                pwd5.setImageResource(R.drawable.ic_round_n);
            case 4:
                pwd4.setImageResource(R.drawable.ic_round_n);
            case 3:
                pwd3.setImageResource(R.drawable.ic_round_n);
            case 2:
                pwd2.setImageResource(R.drawable.ic_round_n);
            case 1:
                pwd1.setImageResource(R.drawable.ic_round_n);
            case 0:
                break;
        }

        if (password.length() == 8) {
            dismiss();
            Setting_Activity.start(activity);
        }

        if (TextUtils.isEmpty(password)) {
            btn11.setEnabled(false);
            btn12.setEnabled(false);
        } else {
            btn11.setEnabled(true);
            btn12.setEnabled(true);
        }
    }
}