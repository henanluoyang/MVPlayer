package com.myapplication.phonemedia.views;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by lenovo on 2017/1/15.
 */

public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(getLayoutResId(),null);
        ButterKnife.bind(this,root);
        init();
        return root;
    }

    protected  void init() {}

    public abstract int getLayoutResId();
}
