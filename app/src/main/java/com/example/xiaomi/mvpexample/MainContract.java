package com.example.xiaomi.mvpexample;

public interface MainContract {

    interface BaseView {
        void showLoading();
        void hideLoading ();
        void showError();

    }

    interface BasePresenterMVP{
        void onAttach();
        void onDeatach();

    }

    interface  BaseInteractor{

    }
}
