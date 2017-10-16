package com.example.zhanggang.strategymode;

import android.util.Log;

/**
 * Created by zhanggang on 2017/10/16.
 * 定义攻击
 */

public class IAttack implements BaseAttack {
    private String attack="降龙十八掌";

    public IAttack(String attack) {
        this.attack = attack;
    }

    @Override
    public void attack() {
        Log.e("TAG", attack);
    }
}
