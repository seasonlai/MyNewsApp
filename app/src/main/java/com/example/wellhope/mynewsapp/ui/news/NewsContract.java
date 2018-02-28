package com.example.wellhope.mynewsapp.ui.news;

import com.example.wellhope.mynewsapp.bean.Channel;
import com.example.wellhope.mynewsapp.ui.base.BaseContract;
import com.example.wellhope.mynewsapp.ui.base.BasePresenter;
import com.example.wellhope.mynewsapp.ui.base.BaseView;

import java.util.List;

/**
 * Created by season on 2018/3/1.
 */

public interface NewsContract{

    interface View extends BaseView{

        void loadData(List<Channel> channels, List<Channel> otherChannels);

    }

    interface Presenter{
        /**
         * 初始化频道
         */
        void getChannel();

    }

}
