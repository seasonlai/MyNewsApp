package com.example.wellhope.mynewsapp.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Wellhope on 2018/2/9.
 */

public abstract class BaseActivity<T extends BaseContract.Presenter> extends SupportActivity {

    @Nullable
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
        create(savedInstanceState);
    }



//    @Override
//    protected void onPause() {
//        super.onPause();
//
//    }


    @Override
    protected void onResume() {
        super.onResume();
        if(mPresenter!=null){
            mPresenter.subscribe();
        }
    }

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

    protected abstract void create(Bundle savedInstanceState);

    protected abstract int getLayoutId();

}
