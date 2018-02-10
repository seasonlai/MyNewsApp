package com.example.wellhope.mynewsapp;

import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    private TextView textView;

    @Inject
    String string;

    @Override
    protected void create() {
        textView = findViewById(R.id.test_title);
        textView.setText(string);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
