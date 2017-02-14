package com.shzlabs.androidmvpboilerplate.injection.component;

import com.shzlabs.androidmvpboilerplate.injection.module.AppModule;
import com.shzlabs.androidmvpboilerplate.ui.main.MainActivity;

import dagger.Component;

/**
 * Created by shaz on 14/2/17.
 */

@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MainActivity activity);
}
