package com.example.wellhope.mynewsapp.di;

import com.example.wellhope.mynewsapp.MyApp;
import com.example.wellhope.mynewsapp.ui.base.BaseModule;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Wellhope on 2018/2/9.
 */

@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        HttpModule.class,
        BaseModule.class,
        ActivityBindingModule.class,
        FragmentBindingModule.class
})
public interface AppComponent extends AndroidInjector<MyApp> {


    @Component.Builder
    abstract class Bulider extends AndroidInjector.Builder<MyApp> {
    }



}
