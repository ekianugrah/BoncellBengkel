package com.boncellstudio.bemonline.sparepart_fragment;

import com.boncellstudio.bemonline.model.JsonArrayProductModel;

import java.util.List;

public interface SparePartView {
    void showProgress();
    void hideProgress();
    void getSparePartSuccess(List<JsonArrayProductModel> response);
    void getSparePartError(String error);
}
