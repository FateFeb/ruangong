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

public class UserMore extends AppCompatActivity {
    private Button mReturnButton;
    private Button mFinishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usermore);
        mReturnButton = (Button) findViewById(R.id.user_more_btn_return);
        mFinishButton = (Button) findViewById(R.id.user_more_btn_finish);
        mReturnButton.setOnClickListener(m_user_more_Listener);
        mFinishButton.setOnClickListener(m_user_more_Listener);
    }

    OnClickListener m_user_more_Listener = new OnClickListener() {    //不同按钮按下的监听事件选择
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.user_more_btn_return:                     //取消按钮的监听事件,由注册界面返回登录界面
                    Intent intent_UserMore_to_Login = new Intent(UserMore.this, User.class);    //切换User Activity至Login Activity
                    startActivity(intent_UserMore_to_Login);
                    finish();
                    break;
                case  R.id.user_more_btn_finish:                     //取消按钮的监听事件,由注册界面返回登录界面
                    Toast.makeText(UserMore.this,"信息更新成功",Toast.LENGTH_SHORT).show();
                    Intent intent_Register_to_Login = new Intent(UserMore.this, User.class);
                    startActivity(intent_Register_to_Login);
                    break;
            }
        }
    };
}
