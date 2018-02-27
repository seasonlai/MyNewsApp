package com.example.wellhope.mynewsapp.welcome;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by season on 2018/2/26.
 */

@Module
public abstract class WelcomeModule {

//    @Provides
//    WelcomePresenter providerPresenter(WelcomeContract.View view){
//        return new WelcomePresenter(view);
//    }


    @Binds
    abstract WelcomeContract.View welcomeView(WelcomeActivity view);

    @Binds
    abstract WelcomeContract.Presenter welcomePresenter(WelcomePresenter presenter);


}
