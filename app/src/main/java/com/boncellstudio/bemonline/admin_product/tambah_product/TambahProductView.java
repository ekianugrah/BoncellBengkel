package com.boncellstudio.bemonline.admin_product.tambah_product;

import com.boncellstudio.bemonline.response.GeneralResponse;

public interface TambahProductView {
    void showProgress();
    void hideProgress();
    void getAdminProductSuccess(GeneralResponse response);
    void getAdminProductError(String error);
}
