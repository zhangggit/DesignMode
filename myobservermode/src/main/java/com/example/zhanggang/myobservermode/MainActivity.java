package com.example.zhanggang.myobservermode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 观察者模式：系统自带的
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化两个服务
        Service service = new Service();
        Service2 service2 = new Service2();
        //两个用户订阅服务
        new User1(service,service2);
        new User2(service,service2);
        //服务发送通知（消息）
        service.setMsg("11111");
        service2.setMsg("22222");

    }
}
