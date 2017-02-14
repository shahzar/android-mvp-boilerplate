package com.shzlabs.androidmvpboilerplate.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.shzlabs.androidmvpboilerplate.R;
import com.shzlabs.androidmvpboilerplate.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements MainView{

    @Inject
    MainPresenter presenter;
    @BindView(R.id.welcome_msg_text_view)
    TextView welcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getTheApplication().getAppComponent().inject(this);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Attach presenter
        presenter.attachView(this);

        // Load welcome message
        presenter.loadWelcomeMessage();
    }

    @Override
    public void displayWelcomeMessage(String msg) {
        welcomeTextView.setVisibility(View.VISIBLE);
        welcomeTextView.setText(msg);
    }
}
