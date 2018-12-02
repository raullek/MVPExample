package com.example.xiaomi.mvpexample;

public class BasePresenter implements MainContract.BasePresenterMVP {

    private MainContract.BaseView mView;
    private MainContract.BaseInteractor mInteractor;

    public BasePresenter(MainContract.BaseView mView) {
        this.mView = mView;
    }

    @Override
    public void onAttach() {

    }

    @Override
    public void onDeatach() {

    }
}
