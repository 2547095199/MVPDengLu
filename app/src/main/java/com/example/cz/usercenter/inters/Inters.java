package com.example.cz.usercenter.inters;

import com.example.cz.usercenter.bean.DengLuBean;
import com.example.cz.usercenter.bean.XiangQingBean;
import com.example.cz.usercenter.bean.ZuCeBean;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by CZ on 2018/1/10.
 */

public interface Inters {

    //http://120.27.23.105/user/login?mobile=15600107201&password=123456
    @GET("/user/login")
    Observable<DengLuBean> get(@Query("mobile") String mobile,@Query("password") String password);
    //http://120.27.23.105/user/reg
    @GET("/user/reg")
    Observable<ZuCeBean> getZC(@QueryMap HashMap<String, String> map);

    //http://120.27.23.105/user/getUserInfo?uid=2866
    @GET("/user/getUserInfo")
    Observable<XiangQingBean> getXQ(@Query("uid") String uid);


}
