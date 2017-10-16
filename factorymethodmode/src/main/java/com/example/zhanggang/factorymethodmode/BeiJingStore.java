package com.example.zhanggang.factorymethodmode;

/**
 * Created by zhanggang on 2017/10/14.
 */

public class BeiJingStore extends RouJiaMoStore {
    @Override
    public RouJiaMo sellroujiamo(String string) {
        RouJiaMo rouJiaMo = null;
        if (string.equals("辣")) {
            rouJiaMo = new LRouJiaMo();
        } else if (string.equals("甜")) {
            rouJiaMo = new TRouJiaMo();
        }
        return rouJiaMo;
    }
}
