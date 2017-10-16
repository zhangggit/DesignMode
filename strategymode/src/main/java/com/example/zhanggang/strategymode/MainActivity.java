package com.example.zhanggang.strategymode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * 策略模式：
 * 游戏做例子
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //玩家1
        User1 user1 = new User1("玩家1");
        user1.setAttack(new IAttack("降龙十八掌"))
                .setDisplay(new IDisplay("回血草"))
                .setFend(new IFend("金钟罩"))
                .setRun(new IRun("金蝉脱壳"));
        Log.e(TAG, user1.name + ":");
        user1.attack();
        user1.fend();
        user1.display();
        user1.run();
        //玩家2
        User2 user2 = new User2("玩家2");
        user2.setAttack(new IAttack("亢龙有悔"))
                .setDisplay(new IDisplay())
                .setFend(new IFend("铁布衫"))
                .setRun(new IRun());
        Log.e(TAG, user2.name + ":");
        user2.attack();
        user2.fend();
        user2.display();
        user2.run();

    }
}
