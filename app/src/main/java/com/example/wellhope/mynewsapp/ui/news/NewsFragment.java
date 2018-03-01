package com.example.wellhope.mynewsapp.ui.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.example.wellhope.mynewsapp.R;
import com.example.wellhope.mynewsapp.bean.Channel;
import com.example.wellhope.mynewsapp.ui.base.BaseFragment;
import com.example.wellhope.mynewsapp.ui.base.SupportFragment;
import com.example.wellhope.mynewsapp.ui.adapter.ChannelPagerAdapter;
import com.example.wellhope.mynewsapp.ui.news.contract.NewsContract;
import com.example.wellhope.mynewsapp.ui.news.presenter.NewsPresenter;
import com.example.wellhope.mynewsapp.widget.CustomViewPager;

import org.simple.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by season on 2018/3/1.
 */

public class NewsFragment extends BaseFragment<NewsPresenter> implements NewsContract.View{


    private static final String TAG = "NewsFragment";

    @BindView(R.id.viewpager)
    CustomViewPager mViewpager;
    @BindView(R.id.iv_edit)
    ImageView mIvEdit;
    @BindView(R.id.SlidingTabLayout)
    com.flyco.tablayout.SlidingTabLayout SlidingTabLayout;

    private ChannelPagerAdapter mChannelPagerAdapter;

    private int selectedIndex;
    private String selectedChannel;

    private List<Channel> mSelectedDatas;
    private List<Channel> mUnSelectedDatas;


    @Override
    public void loadData(List<Channel> channels, List<Channel> unSelectedDatas) {
        if (channels != null) {
            mSelectedDatas.clear();
            mSelectedDatas.addAll(channels);
            mUnSelectedDatas.clear();
            mUnSelectedDatas.addAll(unSelectedDatas);
            mChannelPagerAdapter = new ChannelPagerAdapter(getChildFragmentManager(), channels);
            mViewpager.setAdapter(mChannelPagerAdapter);
            mViewpager.setOffscreenPageLimit(2);
            mViewpager.setCurrentItem(0, false);
            SlidingTabLayout.setViewPager(mViewpager);
        } else {
            toast("数据异常");
        }
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_news_new;
    }

    @Override
    protected void viewCreated(View view, @Nullable Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        mViewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                selectedIndex = position;
                selectedChannel = mSelectedDatas.get(position).getChannelName();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onDestroyView() {
        EventBus.getDefault().unregister(this);
        super.onDestroyView();
    }

    @Override
    protected void lazyInit() {
        mSelectedDatas = new ArrayList<>();
        mUnSelectedDatas = new ArrayList<>();
        mPresenter.getChannel();
    }


    public static SupportFragment newInstance() {
        Bundle args = new Bundle();
        NewsFragment fragment = new NewsFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
