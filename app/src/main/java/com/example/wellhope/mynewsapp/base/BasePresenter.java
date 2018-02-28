package com.example.wellhope.mynewsapp.base;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by season on 2018/2/25.
 */

public abstract class BasePresenter<V extends BaseView> {

    protected CompositeDisposable mCompositeDisposable;

    protected V mView;

    protected abstract void subscribe();

    protected void unSubscribe(){
        if(mCompositeDisposable!=null){

            mCompositeDisposable.clear();

        }
    }

    protected void detachView(){
        if(mView!=null){
            mView = null;
        }
    }

}
