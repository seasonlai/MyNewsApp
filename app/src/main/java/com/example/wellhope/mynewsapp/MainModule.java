package com.example.wellhope.mynewsapp;

import com.example.wellhope.mynewsapp.di.ActivityScoped;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Wellhope on 2018/2/9.
 */

@Module
public class MainModule {

    @ActivityScoped
    @Provides
    Student provideStudent(){Student student = new Student("xxx",16);return student;}
}
