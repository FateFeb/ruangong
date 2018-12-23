package com.example.lbstest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class User extends AppCompatActivity {
    private Button mReturnButton;
    private Button mOrderButton;
    private Button mGetOrderButton;
    private Button mGetinfoButton;
    private Button mGetMapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        mReturnButton = (Button)findViewById(R.id.returnback);
        mOrderButton = (Button)findViewById(R.id.find_order);
        mGetOrderButton=(Button)findViewById(R.id.get_order);
        mGetinfoButton=(Button)findViewById(R.id.add_info);
        mGetMapButton=(Button)findViewById(R.id.get_map);
        mReturnButton.setOnClickListener(m_User_Listener);      //注册界面两个按钮的监听事件
        mOrderButton.setOnClickListener(m_User_Listener);
        mGetOrderButton.setOnClickListener(m_User_Listener);
        mGetinfoButton.setOnClickListener(m_User_Listener);
        mGetMapButton.setOnClickListener(m_User_Listener);
    }
    View.OnClickListener m_User_Listener = new View.OnClickListener() {    //不同按钮按下的监听事件选择
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.returnback:                       //确认按钮的监听事件
                    Intent intent3 = new Intent(User.this,Login.class) ;
                    startActivity(intent3);
                    break;
                case R.id.find_order:                     //取消按钮的监听事件,由注册界面返回登录界面
                    Intent intent_User_to_Order = new Intent(User.this,Order.class) ;    //切换User Activity至Order Activity
                    startActivity(intent_User_to_Order);
                    break;
                case R.id.get_order:
                    Intent intent_User_to_GetOrder = new Intent(User.this,GetOrder.class) ;    //切换User Activity至Order Activity
                    startActivity(intent_User_to_GetOrder);
                    break;
                case R.id.add_info:
                    Intent intent_User_to_UserMore = new Intent(User.this,UserMore.class) ;    //切换User Activity至UserMore Activity
                    startActivity(intent_User_to_UserMore);
                    break;
                case R.id.get_map:
                    Intent intent_User_to_Map = new Intent(User.this,MainActivity.class) ;    //切换User Activity至UserMore Activity
                    startActivity(intent_User_to_Map);
                    break;

            }
        }
    };

}
