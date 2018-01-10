package com.example.cz.usercenter.persenter;

import com.example.cz.usercenter.bean.XiangQingBean;
import com.example.cz.usercenter.model.MyXiangQingCallBack;
import com.example.cz.usercenter.model.MyXiangQingModel;
import com.example.cz.usercenter.view.XiangQingView;

/**
 * Created by CZ on 2018/1/10.
 */

public class XiangQingPersenter {
    XiangQingView view;
    private final MyXiangQingModel model;

    public XiangQingPersenter(XiangQingView view) {
        this.view = view;
        model = new MyXiangQingModel();
    }

    public void getData(String uid) {
        model.get(uid, new MyXiangQingCallBack() {
            @Override
            public void success(XiangQingBean bean) {
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

    public void sasa() {
        this.view = null;
    }
}
