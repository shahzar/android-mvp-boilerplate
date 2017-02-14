package com.shzlabs.androidmvpboilerplate;

import android.app.Application;

import com.shzlabs.androidmvpboilerplate.injection.component.AppComponent;
import com.shzlabs.androidmvpboilerplate.injection.component.DaggerAppComponent;
import com.shzlabs.androidmvpboilerplate.injection.module.AppModule;

public class TheApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}