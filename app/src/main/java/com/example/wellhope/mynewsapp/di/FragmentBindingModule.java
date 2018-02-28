package com.example.wellhope.mynewsapp.di;

import com.example.wellhope.mynewsapp.MainActivity;
import com.example.wellhope.mynewsapp.ui.news.NewsFragment;
import com.example.wellhope.mynewsapp.ui.news.NewsFragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by season on 2018/3/1.
 */

@Module
public abstract class FragmentBindingModule {


    @ContributesAndroidInjector(modules = NewsFragmentModule.class)
    abstract NewsFragment newsFragment();

}
