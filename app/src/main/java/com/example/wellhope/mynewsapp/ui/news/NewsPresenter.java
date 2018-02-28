package com.example.wellhope.mynewsapp.ui.news;

import com.example.wellhope.mynewsapp.ui.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by season on 2018/3/1.
 */

public class NewsPresenter extends BasePresenter<NewsContract.View> implements NewsContract.Presenter {

    @Inject
    public NewsPresenter(NewsContract.View view){
        this.mView = view;
    }


    @Override
    public void subscribe() {

    }

    @Override
    public void getChannel() {

    }
}
