package com.example.cz.usercenter.model;

import android.media.MediaSync;

import com.example.cz.usercenter.app.MyApp;
import com.example.cz.usercenter.bean.DengLuBean;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by CZ on 2018/1/10.
 */

public class MyDengLuModel implements DengLuModel {
    @Override
    public void get(String mobile, String password, final MyDengLuCallBack callBack) {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("mobile", mobile);
//        map.put("password", password);
        MyApp.inters.get(mobile,password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<DengLuBean>() {
                    @Override
                    public void accept(DengLuBean bean) throws Exception {
                        callBack.success(bean);
                    }
                });
    }
}
