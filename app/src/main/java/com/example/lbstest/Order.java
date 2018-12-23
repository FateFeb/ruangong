package com.example.lbstest;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class Order extends AppCompatActivity {             //订单显示界面活动
    private Button mReturnButton;                 //返回按钮
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);
        mReturnButton = (Button) findViewById(R.id.order_btn_return);
        mReturnButton.setOnClickListener(m_order_Listener);
    }
    OnClickListener m_order_Listener = new OnClickListener() {    //不同按钮按下的监听事件选择
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.order_btn_return:                     //取消按钮的监听事件,由注册界面返回登录界面
                    Intent intent_Register_to_Login = new Intent(Order.this,User.class) ;    //切换User Activity至Login Activity
                    startActivity(intent_Register_to_Login);
                    break;
            }
        }
    };

}
