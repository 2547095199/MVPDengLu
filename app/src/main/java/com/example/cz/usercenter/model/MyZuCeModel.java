package com.example.cz.usercenter.model;

import com.example.cz.usercenter.app.MyApp;
import com.example.cz.usercenter.bean.ZuCeBean;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by CZ on 2018/1/10.
 */

public class MyZuCeModel implements ZuCeModel {
    @Override
    public void get(String mobile, String password, final MyZeCeCallBack callBack) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", mobile);
        map.put("password", password);
        MyApp.inters.getZC(map)
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ZuCeBean>() {
                    @Override
                    public void accept(ZuCeBean bean) throws Exception {
                        callBack.success(bean);
                    }
                });
    }
}
