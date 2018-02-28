package com.example.wellhope.mynewsapp.welcome;

import com.example.wellhope.mynewsapp.ui.base.BaseView;

/**
 * Created by season on 2018/2/25.
 */

public class WelcomeContract {

    interface View extends BaseView{

        void startGif();

        void showSkipTime(int time);

        void toMainActivity();
    }

    interface Presenter {
        void toMainActivity();
    }
}
