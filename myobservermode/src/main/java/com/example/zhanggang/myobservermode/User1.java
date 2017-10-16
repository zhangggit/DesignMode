package com.example.zhanggang.myobservermode;

import android.util.Log;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhanggang on 2017/10/16.
 * 用户1---观察者1
 */

public class User1 implements Observer {
    private static final String TAG = "TAG";
    private Service service;
    private Service2 service2;

    public User1(Service service, Service2 service2) {
        this.service = service;
        this.service2 = service2;
        //注册观察者
        service.addObserver(this);
        service2.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        //判断是哪个服务发来的信息
        if (observable instanceof Service) {  //服务1发来的
            Service myservice = (Service) observable;
            Log.e(TAG, "user1---这是服务1发来的信息：" + myservice.getMsg());
        } else if (observable instanceof Service2) {   //服务2发来的
            Service2 myservice = (Service2) observable;
            Log.e(TAG, "user1---这是服务2发来的信息：" + myservice.getMsg());
        }
    }
}
