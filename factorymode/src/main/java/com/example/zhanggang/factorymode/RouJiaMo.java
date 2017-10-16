package com.example.zhanggang.factorymode;

import android.util.Log;

/**
 * Created by zhanggang on 2017/10/14.
 */

public class RouJiaMo {
    private static final String TAG = "TAG";
    public String name;

    public void zhunbei() {
        Log.e("TAG", "zhunbei");
    }

    public void jiagong() {
        Log.e(TAG, "jiagong");
    }

    public void dabao() {
        Log.e(TAG, "dabao");
    }
}
