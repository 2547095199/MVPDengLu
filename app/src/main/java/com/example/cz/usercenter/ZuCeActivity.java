package com.example.cz.usercenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.cz.usercenter.bean.ZuCeBean;
import com.example.cz.usercenter.persenter.ZuCePersenter;
import com.example.cz.usercenter.view.ZuCeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ZuCeActivity extends AppCompatActivity implements ZuCeView {

    @BindView(R.id.fanhui)
    ImageView fanhui;
    @BindView(R.id.phone2)
    EditText phone2;
    @BindView(R.id.mima2)
    EditText mima2;
    @BindView(R.id.zhuce2)
    Button zhuce2;
    ZuCePersenter persenter = new ZuCePersenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zu_ce);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.fanhui, R.id.zhuce2})
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.fanhui:
                finish();
                break;
            case R.id.zhuce2:
                persenter.getData(phone2 + "", mima2 + "");
                break;
        }
    }

    @Override
    public void success(ZuCeBean bean) {
        if (mima2.length() > 6) {
            Toast.makeText(ZuCeActivity.this, bean.getMsg(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(ZuCeActivity.this, bean.getMsg(), Toast.LENGTH_SHORT).show();
            finish();
        }

    }

    @Override
    public void failuer(String e) {
        Toast.makeText(ZuCeActivity.this, "错误", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        persenter.fdfdfdfd();
    }
}
