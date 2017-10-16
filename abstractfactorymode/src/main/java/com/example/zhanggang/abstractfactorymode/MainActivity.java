package com.example.zhanggang.abstractfactorymode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * 工厂模式：3.抽象工厂模式
 * 必须依靠总店提供的材料（类似在MVP模式中 View必须依靠Present一样）
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BeiJlingRouJiaMoStore beiJlingRouJiaMoStore = new BeiJlingRouJiaMoStore();
        RouJiaMo rouJiaMo = beiJlingRouJiaMoStore.sellroujiamo("甜");

        rouJiaMo.zhunbei(beiJlingRouJiaMoStore);
        rouJiaMo.shaokao();
        rouJiaMo.dabao();
        Log.e("TAG", "onCreate: "+rouJiaMo.name );
    }
}
