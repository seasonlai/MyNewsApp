package com.example.wellhope.mynewsapp.di;

import com.example.wellhope.mynewsapp.ui.module.VideoFragmentModule;
import com.example.wellhope.mynewsapp.ui.news.NewsFragment;
import com.example.wellhope.mynewsapp.ui.module.DetailFragmentModule;
import com.example.wellhope.mynewsapp.ui.module.NewsFragmentModule;
import com.example.wellhope.mynewsapp.ui.video.VideoFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by season on 2018/3/1.
 */

@Module
public abstract class FragmentBindingModule {


    @ContributesAndroidInjector(modules = NewsFragmentModule.class)
    abstract NewsFragment newsFragment();

    @ContributesAndroidInjector(modules = DetailFragmentModule.class)
    abstract com.example.wellhope.mynewsapp.ui.news.DetailFragment newsDetailFragment();

    @ContributesAndroidInjector(modules = VideoFragmentModule.class)
    abstract VideoFragment videoFragment();

    @ContributesAndroidInjector(modules = DetailFragmentModule.class)
    abstract com.example.wellhope.mynewsapp.ui.video.DetailFragment videoDetailFragment();

}
