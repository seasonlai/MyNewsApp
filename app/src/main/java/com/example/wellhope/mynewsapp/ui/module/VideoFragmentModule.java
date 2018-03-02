package com.example.wellhope.mynewsapp.ui.module;

import com.example.wellhope.mynewsapp.ui.news.NewsFragment;
import com.example.wellhope.mynewsapp.ui.news.contract.NewsContract;
import com.example.wellhope.mynewsapp.ui.video.VideoFragment;
import com.example.wellhope.mynewsapp.ui.video.contract.VideoContract;

import dagger.Binds;
import dagger.Module;

/**
 * Created by season on 2018/3/1.
 */

@Module
public abstract class VideoFragmentModule {

    @Binds
    abstract VideoContract.View videoView(VideoFragment videoFragment);

}
