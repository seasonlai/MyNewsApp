package com.example.wellhope.mynewsapp.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wellhope.mynewsapp.MyApp;
import com.example.wellhope.mynewsapp.utils.T;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Wellhope on 2018/2/28.
 */

public abstract class BaseFragment<T1 extends BasePresenter> extends SupportFragment implements BaseView{

    @Inject
    protected T1 mPresenter;

    protected View mRootView;

    Unbinder unbinder;

    protected abstract int getLayoutID();

    protected abstract void viewCreated(View view, @Nullable Bundle savedInstanceState);

    protected abstract void lazyInit();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mRootView != null) {
            ViewGroup parent = (ViewGroup) mRootView.getParent();
            if (parent != null) {
                parent.removeView(mRootView);
            }
        } else {
            mRootView = inflater.inflate(getLayoutID(), container, false);
            unbinder = ButterKnife.bind(this, mRootView);
        }

        return mRootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewCreated(view,savedInstanceState);
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        lazyInit();
    }

    protected void toast(String string) {
        T.showShort(MyApp.getContext(), string);
    }

//    @Override
//    public void onResume() {
//        super.onResume();
//        if(mPresenter!=null) {
//            mPresenter.subscribe();
//        }
//    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(unbinder!=null) {
            unbinder.unbind();
        }
        if(mPresenter!=null){
            mPresenter.detachView();
            mPresenter.unSubscribe();
        }
    }


    @Override
    public void showLoading() {

    }

    @Override
    public void showSuccess() {

    }

    @Override
    public void showFailed() {

    }

    @Override
    public void showNoNet() {

    }

    @Override
    public void onRetry() {

    }

}
