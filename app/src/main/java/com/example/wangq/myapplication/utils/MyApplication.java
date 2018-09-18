package com.example.wangq.myapplication.utils;

import android.app.Application;
import android.util.Log;

import org.xutils.BuildConfig;
import org.xutils.x;

//必须继承Application
public class MyApplication extends Application{
    @Override
    public void onCreate(){
        Log.i("test","in myApplication");
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG); // 是否输出debug日志, 开启debug会影响性能.
    }
}
