package com.boncellstudio.bemonline.admin_product.tambah_product;

import com.boncellstudio.bemonline.network.Api;
import com.boncellstudio.bemonline.response.GeneralResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TambahProductPresenter {
    private TambahProductView tambahProductView;

    public TambahProductPresenter(TambahProductView tambahProductView) {
        this.tambahProductView = tambahProductView;
    }

    void createProduct(String token, String accept, String product_name, String product_description, String product_quantity, String image){
        tambahProductView.showProgress();
        Api.getService().createProduct(token, accept, product_name,product_description,product_quantity,image).enqueue(new Callback<GeneralResponse>() {
            @Override
            public void onResponse(Call<GeneralResponse> call, Response<GeneralResponse> response) {
                if (response.isSuccessful()){
                    tambahProductView.hideProgress();
                    if (response.body().getCode() == 0){
                        tambahProductView.getAdminProductSuccess(response.body());
                    }else {
                        tambahProductView.getAdminProductError(response.body().getMessage());
                    }
                }else {
                    tambahProductView.hideProgress();
                    tambahProductView.getAdminProductError(response.message());
                }
            }

            @Override
            public void onFailure(Call<GeneralResponse> call, Throwable t) {
                tambahProductView.hideProgress();
                tambahProductView.getAdminProductError(t.getMessage());
            }
        });
    }
}
