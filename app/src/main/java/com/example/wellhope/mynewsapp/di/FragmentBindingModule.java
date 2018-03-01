package com.example.wellhope.mynewsapp.di;

import com.example.wellhope.mynewsapp.ui.news.DetailFragment;
import com.example.wellhope.mynewsapp.ui.news.NewsFragment;
import com.example.wellhope.mynewsapp.ui.news.module.DetailFragmentModule;
import com.example.wellhope.mynewsapp.ui.news.module.NewsFragmentModule;

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
    abstract DetailFragment detailFragment();

}
