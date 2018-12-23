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

public class GetOrder extends AppCompatActivity {
    private Button mReturnButton;                 //返回按钮
    private Button mGetOrder1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getorder);
        mReturnButton = (Button) findViewById(R.id.get_order_btn_return);
        mGetOrder1=(Button)findViewById(R.id.get1);
        mReturnButton.setOnClickListener(m_order_Listener);
        mGetOrder1.setOnClickListener(m_order_Listener);
    }
    OnClickListener m_order_Listener = new OnClickListener() {    //不同按钮按下的监听事件选择
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.get_order_btn_return:                     //取消按钮的监听事件,由注册界面返回登录界面
                    Intent intent_GetOrder_to_User = new Intent(GetOrder.this,User.class) ;    //切换GetOrder Activity至Order Activity
                    startActivity(intent_GetOrder_to_User);
                    break;
                case R.id.get1:                     //取消按钮的监听事件,由注册界面返回登录界面
                    Toast.makeText(GetOrder.this,"恭喜你，抢到了！",Toast.LENGTH_SHORT).show();
                    Intent intent_GetOrder_to_Order = new Intent(GetOrder.this,Order.class) ;    //切换GetOrder Activity至Order Activity
                    startActivity(intent_GetOrder_to_Order);
                    break;
            }
        }
    };

}
