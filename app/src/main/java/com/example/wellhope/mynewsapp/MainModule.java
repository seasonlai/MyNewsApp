package com.example.wellhope.mynewsapp;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Wellhope on 2018/2/9.
 */

@Module
public abstract class MainModule {

    @Provides
    public static String provideS(){
        return "xxxxxooooo";
    }

}
