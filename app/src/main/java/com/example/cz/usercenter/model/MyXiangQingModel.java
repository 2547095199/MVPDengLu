package com.example.cz.usercenter.model;

import com.example.cz.usercenter.app.MyApp;
import com.example.cz.usercenter.bean.XiangQingBean;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by CZ on 2018/1/10.
 */

public class MyXiangQingModel implements XiangQingModel {
    @Override
    public void get(String uid, final MyXiangQingCallBack callBack) {
        MyApp.inters.getXQ(uid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<XiangQingBean>() {
                    @Override
                    public void accept(XiangQingBean bean) throws Exception {
                        callBack.success(bean);
                    }
                });
    }
}
