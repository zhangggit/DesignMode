package com.example.zhanggang.myobservermode;

import java.util.Observable;

/**
 * Created by zhanggang on 2017/10/16.
 * 服务2---被观察者
 */

public class Service2 extends Observable {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();  //设置改变
        notifyObservers();  //通知观察者
    }
}
