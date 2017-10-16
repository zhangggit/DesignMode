package com.example.zhanggang.factorymode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.sql.SQLOutput;

/**
 * 工厂模式：1.简单工厂模式
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RouJiaMoFactory rouJiaMoFactory = new RouJiaMoFactory();
        RouJiaMoStore rouJiaMoStore = new RouJiaMoStore(rouJiaMoFactory);
        RouJiaMo rouJiaMo = rouJiaMoStore.sellroujiamo("辣");
        Log.e(TAG, rouJiaMo.name);

    }
}
