package com.boncellstudio.bemonline.login;

import com.boncellstudio.bemonline.response.LoginModelResponse;

public interface LoginView {
    void showProgressBar();
    void hideProgressBar();
    void successLogin(LoginModelResponse response);
    void errorLogin(String error);
}
