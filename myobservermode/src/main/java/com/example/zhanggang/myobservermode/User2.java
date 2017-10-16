package com.example.zhanggang.myobservermode;

import android.util.Log;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhanggang on 2017/10/16.
 * 用户2---观察者2
 */

public class User2 implements Observer {

    private static final String TAG = "TAG";
    private Service service;
    private Service2 service2;

    public User2(Service service, Service2 service2) {
        this.service = service;
        this.service2 = service2;
        //注册观察者
        service.addObserver(this);
        service2.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        //判断哪个服务发来的消息
        if (observable instanceof Service) {
            Service myservice = (Service) observable;
            Log.e(TAG,"user2---这是服务1发来的消息"+myservice.getMsg());
        } else if (observable instanceof Service2) {
            Service2 myservice = (Service2) observable;
            Log.e(TAG, "user2---这是服务2发来的消息"+myservice.getMsg());
        }
    }
}
