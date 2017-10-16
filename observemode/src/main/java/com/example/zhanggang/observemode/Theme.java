package com.example.zhanggang.observemode;

/**
 * Created by zhanggang on 2017/10/16.
 * 接口实现注册、移除、通知的接口
 */

public interface Theme {
    void registerObserver(MyObserver myObserver);
    void removeObserver(MyObserver myObserver);
    void notifyObserver();
}
