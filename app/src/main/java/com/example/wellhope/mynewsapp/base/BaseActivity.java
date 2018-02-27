package com.example.wellhope.mynewsapp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by Wellhope on 2018/2/9.
 */

public abstract class BaseActivity<T extends BasePresenter> extends DaggerAppCompatActivity {

    @Inject
    protected T mPresenter;

    Unbinder mUnbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int resId = getLayoutId();
        if(resId>0){
            setContentView(resId);
        }
        mUnbinder = ButterKnife.bind(this);
        create();
    }



//    @Override
//    protected void onPause() {
//        super.onPause();
//
//    }


//    @Override
//    protected void onResume() {
//        super.onResume();
//        if(mPresenter!=null){
//            mPresenter.subscribe();
//        }
//    }

    @Override
    protected void onDestroy() {
        if(mPresenter!=null){
            mPresenter.unSubscribe();
            mPresenter.detachView();
        }
        if(mUnbinder!=null){
            mUnbinder.unbind();
        }
        super.onDestroy();
    }

    protected abstract void create();

    protected abstract int getLayoutId();

}
