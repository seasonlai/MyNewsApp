package com.example.wellhope.mynewsapp.di;

import com.example.wellhope.mynewsapp.MainActivity;
import com.example.wellhope.mynewsapp.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Wellhope on 2018/2/9.
 */
@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();


}
