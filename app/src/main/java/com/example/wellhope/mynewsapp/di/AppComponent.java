package com.example.wellhope.mynewsapp.di;

import android.app.Application;

import com.example.wellhope.mynewsapp.MainModule;
import com.example.wellhope.mynewsapp.MyApp;
import com.example.wellhope.mynewsapp.base.BaseModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Wellhope on 2018/2/9.
 */

@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityBindingModule.class
})
public interface AppComponent extends AndroidInjector<MyApp> {


    @Component.Builder
    abstract class Bulider extends AndroidInjector.Builder<MyApp> {
    }



}
