package com.example.zhanggang.observemode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 观察者模式：自己定义的
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyService myService = new MyService();  //实例化一个服务
        new User1(myService);  //用户1订阅服务
        new User2(myService);  //用户2订阅服务
        myService.setMsg("服务发出的消息：“明天下雨，出门记得带伞。”");
    }
}
