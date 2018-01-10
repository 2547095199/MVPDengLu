package com.example.cz.usercenter.model;

import com.example.cz.usercenter.bean.XiangQingBean;

/**
 * Created by CZ on 2018/1/10.
 */

public interface MyXiangQingCallBack {
    public void success(XiangQingBean bean);

    public void failuer(String e);
}
