package com.example.cz.usercenter.view;

import com.example.cz.usercenter.bean.DengLuBean;

/**
 * Created by CZ on 2018/1/10.
 */

public interface DengLuView {
    public void success(DengLuBean bean);

    public void failuer(String e);
}
