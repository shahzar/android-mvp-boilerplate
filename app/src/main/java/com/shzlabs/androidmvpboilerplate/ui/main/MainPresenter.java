package com.shzlabs.androidmvpboilerplate.ui.main;

import android.util.Log;

import com.shzlabs.androidmvpboilerplate.data.local.DatabaseHelper;
import com.shzlabs.androidmvpboilerplate.data.model.SampleModel;
import com.shzlabs.androidmvpboilerplate.ui.base.BasePresenter;

import java.util.List;

import javax.inject.Inject;

import rx.Subscriber;

/**
 * Created by shaz on 14/2/17.
 */

public class MainPresenter extends BasePresenter<MainView> {

    private static final String TAG = MainPresenter.class.getSimpleName();
    DatabaseHelper dbHelper;

    @Inject
    public MainPresenter(DatabaseHelper dbHelper) {
        this.dbHelper = dbHelper;
    }

    void loadWelcomeMessage() {
        getMvpView().displayWelcomeMessage("Welcome to MVP Sample App");
        dbHelper.getDeeds().subscribe(new Subscriber<List<SampleModel>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(List<SampleModel> sampleModels) {
                Log.d(TAG, "onNext: ");
            }
        });
    }

}
