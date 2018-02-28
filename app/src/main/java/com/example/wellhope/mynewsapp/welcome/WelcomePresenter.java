package com.example.wellhope.mynewsapp.welcome;


import com.example.wellhope.mynewsapp.base.BasePresenter;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.observers.DisposableObserver;

/**
 * Created by season on 2018/2/25.
 */

public class WelcomePresenter extends BasePresenter<WelcomeContract.View> implements WelcomeContract.Presenter {

    @Inject
    public WelcomePresenter(WelcomeContract.View view){
        this.mView = view;
//        this.mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    public void subscribe() {
        mView.startGif();

        mCompositeDisposable.add(countDown(3)
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(@NonNull Disposable disposable) throws Exception {
                        mView.showSkipTime(4);
                    }
                }).subscribeWith(new DisposableObserver<Integer>() {
                    @Override
                    public void onNext(Integer integer) {
                        mView.showSkipTime(integer);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        mView.toMainActivity();
                    }
                }));
    }


    public Observable<Integer> countDown(int time) {
        if (time < 0) time = 0;
        final int countTime = time;
        return Observable.interval(0, 1, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Function<Long, Integer>() {
                    @Override
                    public Integer apply(@NonNull Long aLong) throws Exception {
                        return countTime - aLong.intValue();
                    }
                })
                .take(countTime + 1);
    }

    @Override
    public void toMainActivity() {
        this.mView.toMainActivity();
    }
}
