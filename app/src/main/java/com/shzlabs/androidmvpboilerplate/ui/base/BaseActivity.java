package com.shzlabs.androidmvpboilerplate.ui.base;

import android.support.v7.app.AppCompatActivity;

import com.shzlabs.androidmvpboilerplate.TheApplication;

public class BaseActivity extends AppCompatActivity {

    public TheApplication getTheApplication() {
        return ((TheApplication) getApplication());
    }

}