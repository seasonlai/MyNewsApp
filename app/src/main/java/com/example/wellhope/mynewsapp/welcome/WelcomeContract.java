package com.example.wellhope.mynewsapp.welcome;

import com.example.wellhope.mynewsapp.base.BasePresenter;
import com.example.wellhope.mynewsapp.base.BaseView;

/**
 * Created by season on 2018/2/25.
 */

public class WelcomeContract {

    interface View extends BaseView<WelcomePresenter>{

        void startGif();

        void showSkipTime(int time);

        void toMainActivity();
    }

    static abstract class Presenter extends BasePresenter<WelcomeContract.View>{

        abstract void start();
    }
}
