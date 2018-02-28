package com.example.wellhope.mynewsapp.ui.news;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

import com.example.wellhope.mynewsapp.R;
import com.example.wellhope.mynewsapp.bean.Channel;
import com.example.wellhope.mynewsapp.ui.base.BaseFragment;
import com.example.wellhope.mynewsapp.ui.base.SupportFragment;

import java.util.List;

import butterknife.BindView;

/**
 * Created by season on 2018/3/1.
 */

public class NewsFragment extends BaseFragment<NewsPresenter> implements NewsContract.View{


    private static final String TAG = "NewsFragment";

    @BindView(R.id.viewpager)
    ViewPager mViewpager;
    @BindView(R.id.iv_edit)
    ImageView mIvEdit;
    @BindView(R.id.SlidingTabLayout)
    com.flyco.tablayout.SlidingTabLayout SlidingTabLayout;

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

    @Override
    public void loadData(List<Channel> channels, List<Channel> otherChannels) {

    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_news_new;
    }

    public static SupportFragment newInstance() {
        Bundle args = new Bundle();
        NewsFragment fragment = new NewsFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
