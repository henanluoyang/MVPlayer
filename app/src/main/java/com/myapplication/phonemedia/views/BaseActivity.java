package com.myapplication.phonemedia.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by lenovo on 2017/1/15.
 */

public abstract class BaseActivity extends AppCompatActivity {

    /*
    * 封装Activity通用的功能
    * */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        ButterKnife.bind(this);
        init();
    }
    //子类选择实现
    protected  void init() {}

    //子类必须实现
    public abstract int getLayoutResId();
}
