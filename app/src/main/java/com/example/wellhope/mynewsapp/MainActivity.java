package com.example.wellhope.mynewsapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import com.example.wellhope.mynewsapp.ui.base.BaseActivity;
import com.example.wellhope.mynewsapp.ui.base.SupportFragment;
import com.example.wellhope.mynewsapp.ui.news.NewsFragment;
import com.example.wellhope.mynewsapp.ui.video.VideoFragment;
import com.example.wellhope.mynewsapp.utils.StatusBarUtil;
import com.example.wellhope.mynewsapp.widget.BottomBar;
import com.example.wellhope.mynewsapp.widget.BottomBarTab;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @BindView(R.id.contentContainer)
    FrameLayout mContentContainer;
    @BindView(R.id.bottomBar)
    BottomBar mBottomBar;

    private SupportFragment[] mFragments = new SupportFragment[2];

    @Override
    protected void create(Bundle savedInstanceState) {

        StatusBarUtil.setTranslucentForImageViewInFragment(MainActivity.this, 0, null);
        if (savedInstanceState == null) {
            mFragments[0] = NewsFragment.newInstance();
            mFragments[1] = VideoFragment.newInstance();
//            mFragments[2] = JanDanFragment.newInstance();
//            mFragments[3] = PersonalFragment.newInstance();
            getSupportDelegate().loadMultipleRootFragment(R.id.contentContainer, 0,
                    mFragments);
        } else {
            mFragments[0] = findFragment(NewsFragment.class);
            mFragments[1] = findFragment(VideoFragment.class);
//            mFragments[2] = findFragment(JanDanFragment.class);
//            mFragments[3] = findFragment(PersonalFragment.class);
        }

        mBottomBar.addItem(new BottomBarTab(this, R.mipmap.ic_news, "新闻"))
                .addItem(new BottomBarTab(this, R.mipmap.ic_video, "视频"))
                .addItem(new BottomBarTab(this, R.mipmap.ic_jiandan, "煎蛋"))
                .addItem(new BottomBarTab(this, R.mipmap.ic_my, "我的"));
        mBottomBar.setOnTabSelectedListener(new BottomBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position, int prePosition) {
                if (position < mFragments.length)
                    showHideFragment(mFragments[position]);
//                    showHideFragment(mFragments[position], mFragments[prePosition]);
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
