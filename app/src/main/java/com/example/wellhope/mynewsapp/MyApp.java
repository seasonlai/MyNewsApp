package com.example.wellhope.mynewsapp;

import android.app.Application;

import com.example.wellhope.mynewsapp.di.DaggerAppComponent;

import org.litepal.LitePal;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DaggerApplication_MembersInjector;

/**
 * Created by Wellhope on 2018/2/9.
 */

public class MyApp extends DaggerApplication {

    private static Application mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
        mContext = this;
    }

    public static Application getContext() {
        return mContext;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
