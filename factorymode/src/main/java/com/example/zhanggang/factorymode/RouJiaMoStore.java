package com.example.zhanggang.factorymode;

import android.util.Log;

/**
 * Created by zhanggang on 2017/10/14.
 */

public class RouJiaMoStore {
    RouJiaMoFactory rouJiaMoFactory;

    public RouJiaMoStore(RouJiaMoFactory rouJiaMoFactory) {
        this.rouJiaMoFactory = rouJiaMoFactory;
    }
    public RouJiaMo sellroujiamo(String string){
        RouJiaMo rouJiaMo = rouJiaMoFactory.zhizuo(string);
        rouJiaMo.zhunbei();
        rouJiaMo.jiagong();
        rouJiaMo.dabao();
        return rouJiaMo;
    }

}
