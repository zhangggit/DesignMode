package com.example.zhanggang.strategymode;

import android.util.Log;

/**
 * Created by zhanggang on 2017/10/16.
 * 定义逃跑
 */

public class IRun implements BaseRun {
    private String run="金蝉脱壳";

    public IRun(String run) {
        this.run = run;
    }
    public IRun() {

    }

    @Override
    public void run() {
        Log.e("TAG",run );
    }
}
