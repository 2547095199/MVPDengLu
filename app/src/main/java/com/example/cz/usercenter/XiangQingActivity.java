package com.example.cz.usercenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cz.usercenter.bean.XiangQingBean;
import com.example.cz.usercenter.persenter.XiangQingPersenter;
import com.example.cz.usercenter.view.XiangQingView;
import com.facebook.drawee.view.SimpleDraweeView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;

public class XiangQingActivity extends AppCompatActivity implements XiangQingView {

    @BindView(R.id.fanhui)
    ImageView fanhui;
    @BindView(R.id.name)
    TextView name;
    XiangQingPersenter persenter = new XiangQingPersenter(this);
    SimpleDraweeView mSimple;
    private String uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiang_qing);
        ButterKnife.bind(this);
//        Intent intent = getIntent();
//        uid = intent.getStringExtra("uid");
//        persenter.getData(uid + "");
        EventBus.getDefault().register(XiangQingActivity.this);
    }

    @Override
    public void success(XiangQingBean bean) {
        name.setText(bean.getData().getUsername() + "");
    }

    @Override
    public void failuer(String e) {
        Toast.makeText(XiangQingActivity.this, "错误", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(XiangQingActivity.this);
        persenter.sasa();
    }

    @Subscribe(threadMode = ThreadMode.POSTING, sticky = true)
    public void onMoonEvent(UserEvent userevent) {
//        tv_b.setText("账号："+userevent.getUsername()+"密码："+userevent.getPasswork());
        persenter.getData(userevent.getUid() + "");
    }

}
