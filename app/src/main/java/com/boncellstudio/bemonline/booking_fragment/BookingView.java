package com.boncellstudio.bemonline.booking_fragment;

import com.boncellstudio.bemonline.response.GeneralResponse;

public interface BookingView {
    void showProgress();
    void hideProgress();
    void postBookingSuccess(GeneralResponse response);
    void postBookingError(String error);
}
