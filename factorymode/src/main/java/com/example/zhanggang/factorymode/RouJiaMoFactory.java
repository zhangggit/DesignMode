package com.example.zhanggang.factorymode;

/**
 * Created by zhanggang on 2017/10/14.
 */

public class RouJiaMoFactory {

    public RouJiaMo zhizuo(String s) {
        RouJiaMo rouJiaMo = null;
        if (s.equals("辣")) {
            rouJiaMo = new LRouJiaMo();
        } else if (s.equals("甜")) {
            rouJiaMo = new TRouJiaMo();
        }
        return rouJiaMo;
    }
}
