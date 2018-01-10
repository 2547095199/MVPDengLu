package com.example.cz.usercenter.app;

import android.app.Application;

import com.example.cz.usercenter.inters.Inters;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by CZ on 2018/1/10.
 */

public class MyApp extends Application {

    public static Inters inters;

    @Override
    public void onCreate() {
        super.onCreate();
        //http://120.27.23.105/user/login?mobile=15600107201&password=123456
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://120.27.23.105")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        inters = retrofit.create(Inters.class);
    }
}
