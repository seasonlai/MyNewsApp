package com.example.wellhope.mynewsapp.ui.news.module;

import com.example.wellhope.mynewsapp.ui.news.DetailFragment;
import com.example.wellhope.mynewsapp.ui.news.NewsFragment;
import com.example.wellhope.mynewsapp.ui.news.contract.DetailContract;
import com.example.wellhope.mynewsapp.ui.news.contract.NewsContract;

import dagger.Binds;
import dagger.Module;

/**
 * Created by season on 2018/3/1.
 */

@Module
public abstract class DetailFragmentModule {

    @Binds
    abstract DetailContract.View detailView(DetailFragment detailFragment);

}
