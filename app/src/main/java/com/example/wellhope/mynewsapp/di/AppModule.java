package com.example.wellhope.mynewsapp.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Wellhope on 2018/2/9.
 */
@Module
public abstract class AppModule {

    @Binds
    abstract Context bindContext(Application application);
}