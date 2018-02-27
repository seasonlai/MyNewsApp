package com.example.wellhope.mynewsapp.base;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by season on 2018/2/25.
 */

@Module
public class BaseModule {

    @Provides
    CompositeDisposable providerCompositeDisposable(){
        return new CompositeDisposable();
    }
}
