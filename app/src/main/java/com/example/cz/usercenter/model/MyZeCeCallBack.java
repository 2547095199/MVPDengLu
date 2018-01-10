package com.example.cz.usercenter.model;

import com.example.cz.usercenter.bean.ZuCeBean;

/**
 * Created by CZ on 2018/1/10.
 */

public interface MyZeCeCallBack {
    public void success(ZuCeBean bean);

    public void failuer(String e);
}
