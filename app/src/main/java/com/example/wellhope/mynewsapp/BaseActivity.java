package com.example.wellhope.mynewsapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by Wellhope on 2018/2/9.
 */

public abstract class BaseActivity extends DaggerAppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int resId = getLayoutId();
        if(resId>0){
            setContentView(resId);
        }
        create();
    }

    protected abstract void create();

    protected abstract int getLayoutId();

}
