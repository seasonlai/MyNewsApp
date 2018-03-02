package com.example.wellhope.mynewsapp.ui.module;

import com.example.wellhope.mynewsapp.ui.news.DetailFragment;
import com.example.wellhope.mynewsapp.ui.news.contract.DetailContract;
import com.example.wellhope.mynewsapp.ui.video.contract.VideoContract;

import dagger.Binds;
import dagger.Module;

/**
 * Created by season on 2018/3/1.
 */

@Module
public abstract class DetailFragmentModule {

    @Binds
    abstract DetailContract.View newsDetailView(com.example.wellhope.mynewsapp.ui.news.DetailFragment detailFragment);

    @Binds
    abstract VideoContract.View videoDetailView(com.example.wellhope.mynewsapp.ui.video.DetailFragment detailFragment);

}
