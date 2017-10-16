package com.example.zhanggang.observemode;

import android.util.Log;

/**
 * Created by zhanggang on 2017/10/16.
 * 用户2--观察者2
 */

public class User2 implements MyObserver {
    private static final String TAG = "TAG";
    private Theme theme;

    public User2(Theme theme) {
        this.theme = theme;
        theme.registerObserver(this);
    }

    @Override
    public void update(String string) {
        Log.e(TAG, "用户2收到的信息："+string);
    }
}
