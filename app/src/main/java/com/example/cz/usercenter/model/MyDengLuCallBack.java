package com.example.cz.usercenter.model;

import com.example.cz.usercenter.bean.DengLuBean;

/**
 * Created by CZ on 2018/1/10.
 */

public interface MyDengLuCallBack {
    public void success(DengLuBean bean);

    public void failuer(String e);
}
