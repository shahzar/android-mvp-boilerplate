package com.shzlabs.androidmvpboilerplate.ui.main;

import com.shzlabs.androidmvpboilerplate.ui.base.MvpView;

/**
 * Created by shaz on 14/2/17.
 */

public interface MainView extends MvpView{
    void displayWelcomeMessage(String msg);
}
