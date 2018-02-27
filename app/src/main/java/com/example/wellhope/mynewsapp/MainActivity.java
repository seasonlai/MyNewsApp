package com.example.wellhope.mynewsapp;

import android.widget.TextView;
import android.widget.Toast;

import com.example.wellhope.mynewsapp.base.BaseActivity;
import com.example.wellhope.mynewsapp.di.ActivityScoped;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    private TextView textView;

//    @Inject
//    String string;

    @ActivityScoped
    @Inject
    Student student;

    @Override
    protected void create() {
        textView = findViewById(R.id.test_title);
        textView.setText(student.name+"  "+student.age);
        Toast.makeText(MyApp.getContext(),"6666",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
