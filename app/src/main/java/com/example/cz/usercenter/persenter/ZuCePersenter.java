package com.example.cz.usercenter.persenter;

import com.example.cz.usercenter.bean.ZuCeBean;
import com.example.cz.usercenter.model.MyZeCeCallBack;
import com.example.cz.usercenter.model.MyZuCeModel;
import com.example.cz.usercenter.view.ZuCeView;

/**
 * Created by CZ on 2018/1/10.
 */

public class ZuCePersenter {
    ZuCeView view;
    private final MyZuCeModel model;

    public ZuCePersenter(ZuCeView view) {
        this.view = view;
        model = new MyZuCeModel();
    }

    public void getData(String mobile, String password) {
        model.get(mobile, password, new MyZeCeCallBack() {
            @Override
            public void success(ZuCeBean bean) {
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

    public void fdfdfdfd() {
        this.view = null;
    }
}
