package com.example.zhanggang.observemode;

import android.util.Log;

/**
 * Created by zhanggang on 2017/10/16.
 * 用户1--观察者1
 */

public class User1 implements MyObserver {
    private static final String TAG = "TAG";
    private Theme theme;

    public User1(Theme theme) {
        this.theme = theme;
        theme.registerObserver(this);
    }

    @Override
    public void update(String string) {
        Log.e(TAG, "用户1收到的信息： "+string );
    }
}
