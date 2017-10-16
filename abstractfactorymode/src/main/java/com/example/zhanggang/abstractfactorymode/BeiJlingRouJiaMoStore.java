package com.example.zhanggang.abstractfactorymode;

/**
 * Created by zhanggang on 2017/10/14.
 */

public class BeiJlingRouJiaMoStore extends RouJiaMoStore implements RouJiaMoFactory {
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

    @Override
    public Rou byrou() {
        return new Rou();
    }

    @Override
    public Mian bymian() {
        return new Mian();
    }
}
