package com.example.wellhope.mynewsapp.welcome;


import android.content.Intent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.wellhope.mynewsapp.MainActivity;
import com.example.wellhope.mynewsapp.R;
import com.example.wellhope.mynewsapp.base.BaseActivity;
import com.example.wellhope.mynewsapp.utils.ImageLoaderUtil;

import butterknife.BindView;
import butterknife.OnClick;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class WelcomeActivity extends BaseActivity<WelcomePresenter> implements WelcomeContract.View{

    @BindView(R.id.gifImageView)
    GifImageView gifImageView;
    @BindView(R.id.iv_ad)
    ImageView ivAd;
    @BindView(R.id.ll_bottom)
    RelativeLayout llBottom;
    @BindView(R.id.tv_skip)
    TextView tvSkip;
    @BindView(R.id.fl_ad)
    FrameLayout flAd;

    @Override
    protected void create() {
        setPresenter(new WelcomePresenter(this));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_welcome;
    }

    @Override
    public void startGif() {
        final GifDrawable gifDrawable = (GifDrawable) gifImageView.getDrawable();
        gifDrawable.setLoopCount(1);
        gifImageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                gifDrawable.start();
            }
        }, 100);
        //必应每日壁纸 来源于 https://www.dujin.org/fenxiang/jiaocheng/3618.html.
        ImageLoaderUtil.LoadImage(this, "http://api.dujin.org/bing/1920.php", ivAd);
    }


    @OnClick(R.id.fl_ad)
    public void onViewClicked() {
        toMainActivity();
    }

    @Override
    public void showSkipTime(int time) {
        tvSkip.setText("跳过 " + time);
    }

    @Override
    public void toMainActivity() {
        Intent intent = new Intent();
        intent.setClass(WelcomeActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }



    @Override
    public void setPresenter(WelcomePresenter presenter) {
        this.mPresenter = presenter;
    }
}
