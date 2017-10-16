package com.example.zhanggang.observemode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhanggang on 2017/10/16.
 * 服务  用于提供信息--被观察者
 */

public class MyService implements Theme {
    //集合用于存放观察者
    protected List<MyObserver> list = new ArrayList<>();
    private String msg;  //发送的模拟消息

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObserver();
    }

    @Override
    public void registerObserver(MyObserver myObserver) {
        list.add(myObserver);
    }

    @Override
    public void removeObserver(MyObserver myObserver) {
        if (list.size() > 0) {
            list.remove(myObserver);
        }
    }

    @Override
    public void notifyObserver() {
        for (MyObserver bean : list) {
            bean.update(msg);
        }
    }
}
