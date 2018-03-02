package com.example.wellhope.mynewsapp.ui.module;

import com.example.wellhope.mynewsapp.ui.news.NewsFragment;
import com.example.wellhope.mynewsapp.ui.news.contract.NewsContract;

import dagger.Binds;
import dagger.Module;

/**
 * Created by season on 2018/3/1.
 */

@Module
public abstract class NewsFragmentModule {

    @Binds
    abstract NewsContract.View newsView(NewsFragment newsFragment);

}
