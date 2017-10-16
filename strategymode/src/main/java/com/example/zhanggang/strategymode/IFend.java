package com.example.zhanggang.strategymode;

import android.util.Log;

import java.io.PipedReader;

/**
 * Created by zhanggang on 2017/10/16.
 * 定义防御
 */

public class IFend implements BaseFend {
    private String fend="铁布衫";

    public IFend(String fend) {
        this.fend = fend;
    }

    @Override
    public void fend() {
        Log.e("TAG", fend );
    }
}
