package com.example.zhanggang.strategymode;

import android.util.Log;

/**
 * Created by zhanggang on 2017/10/16.
 * 定义技能
 */

public class IDisplay implements BaseDisplay {
    private String display="回血";

    public IDisplay(String display) {
        this.display = display;
    }
    public IDisplay() {

    }

    @Override
    public void diaplay() {
        Log.e("TAG", display );
    }
}
