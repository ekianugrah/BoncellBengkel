package com.boncellstudio.bemonline.booking_fragment;

import com.boncellstudio.bemonline.network.Api;
import com.boncellstudio.bemonline.response.GeneralResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookingPresenter {
    private BookingView view;

    public BookingPresenter(BookingView view) {
        this.view = view;
    }

    void postBooking(String token, String accept, String name, String stnk, int tuneup, int gantioli, String keluhan){
        view.showProgress();
        Api.getService().bookService(token, accept, name, stnk, tuneup, gantioli, keluhan).enqueue(new Callback<GeneralResponse>() {
            @Override
            public void onResponse(Call<GeneralResponse> call, final Response<GeneralResponse> response) {
                if (response.isSuccessful()) {
                    view.hideProgress();
                    if (response.body().getCode() == 0) {
                        view.postBookingSuccess(response.body());
                    } else {
                        view.postBookingError(response.body().getMessage());
                    }
                } else {
                    view.hideProgress();
                    view.postBookingError(response.message());
                }
            }

            @Override
            public void onFailure(Call<GeneralResponse> call, Throwable t) {
                view.hideProgress();
                view.postBookingError(t.getMessage());
            }
        });
    }
}
