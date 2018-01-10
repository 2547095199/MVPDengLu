package com.example.cz.usercenter.persenter;

import com.example.cz.usercenter.bean.DengLuBean;
import com.example.cz.usercenter.model.MyDengLuCallBack;
import com.example.cz.usercenter.model.MyDengLuModel;
import com.example.cz.usercenter.view.DengLuView;

/**
 * Created by CZ on 2018/1/10.
 */

public class DengLuPersenter {
    DengLuView view;
    private final MyDengLuModel model;

    public DengLuPersenter(DengLuView view) {
        this.view = view;
        model = new MyDengLuModel();
    }

    public void getData(String mobile, String password) {
        model.get(mobile, password, new MyDengLuCallBack() {
            @Override
            public void success(DengLuBean bean) {
                if (view != null) {
                    view.success(bean);
                }
            }

            @Override
            public void failuer(String e) {
                if (view != null) {
                    view.failuer(e);
                }
            }
        });
    }

    public void dsdsds() {
        this.view = null;
    }
}
