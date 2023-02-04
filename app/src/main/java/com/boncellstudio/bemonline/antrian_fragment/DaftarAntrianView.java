package com.boncellstudio.bemonline.antrian_fragment;

import com.boncellstudio.bemonline.model.AntrianModel;

import java.util.List;

public interface DaftarAntrianView {
    void showProgress();
    void hideProgress();
    void getAntrianSuccess(List<AntrianModel> data);
    void getAntrianError(String error);
}
