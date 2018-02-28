package com.example.wellhope.mynewsapp.di;

import com.example.wellhope.mynewsapp.MainActivity;
import com.example.wellhope.mynewsapp.welcome.WelcomeActivity;
import com.example.wellhope.mynewsapp.welcome.WelcomeModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Wellhope on 2018/2/9.
 */
@Module
public abstract class ActivityBindingModule {


//    @ActivityScoped
//    @ContributesAndroidInjector(modules = BaseModule.class)
//    abstract BaseActivity baseActivity();

    @ActivityScoped
    @ContributesAndroidInjector()
    abstract MainActivity mainActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = WelcomeModule.class)
    abstract WelcomeActivity welcomeActivity();


}
