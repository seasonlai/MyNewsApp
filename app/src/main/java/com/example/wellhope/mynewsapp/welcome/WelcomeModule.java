package com.example.wellhope.mynewsapp.welcome;


import dagger.Binds;
import dagger.Module;

/**
 * Created by season on 2018/2/26.
 */

@Module
public abstract class WelcomeModule {
    @Binds
    abstract WelcomeContract.View welcomeView(WelcomeActivity view);
}
