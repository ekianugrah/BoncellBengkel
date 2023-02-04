package com.boncellstudio.bemonline.admin_product;

import java.util.List;

public interface AdminProductView {
    void showProgress();
    void hideProgress();
    void getAdminProductSuccess(List<AdminProductModel> response);
    void getAdminProductError(String error);
}
