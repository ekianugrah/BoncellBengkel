package com.boncellstudio.bemonline.register;

import com.boncellstudio.bemonline.response.GeneralResponse;

public interface RegisterView {
    void showProgressBar();
    void hideProgressBar();
    void successRegister(GeneralResponse response);
    void errorRegister(String error);
}
