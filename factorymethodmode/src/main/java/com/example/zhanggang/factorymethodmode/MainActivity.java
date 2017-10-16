package com.example.zhanggang.factorymethodmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * 工厂模式：2.工厂方法模式
 * 商店的子类，决定应该实例化谁
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BeiJingStore beiJingStore = new BeiJingStore();
        RouJiaMo rouJiaMo = beiJingStore.sellroujiamo("甜");
        rouJiaMo.zhunbei();
        rouJiaMo.shaokao();
        rouJiaMo.dabao();
        Log.e(TAG, "onCreate: " + rouJiaMo.name);


    }
}
