package com.example.zhanggang.abstractfactorymode;

import android.util.Log;

/**
 * Created by zhanggang on 2017/10/14.
 */

public class RouJiaMo {
    private static final String TAG = "TAG";
    public String name;
    public void zhunbei(RouJiaMoFactory rouJiaMoFactory){
        Mian mian = rouJiaMoFactory.bymian();
        Rou rou = rouJiaMoFactory.byrou();
        Log.e(TAG, "zhunbei: "+mian+"----"+rou);
    }
    public void shaokao(){
        Log.e(TAG, "shaokao: ");
    }
    public void dabao(){
        Log.e(TAG, "dabao: " );
    }
}
