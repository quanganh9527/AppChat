package com.ntu.quanganh.appchat;

import android.widget.ImageView;

/**
 * Created by quang on 03/14/2017.
 */

public class ItemComent {
    String tenbenh;
    String tennguoibenh,thongtinnguoibenh,motabenh;
    ImageView imageView;

    public ItemComent(String tenbenh, String tennguoibenh, String thongtinnguoibenh, String motabenh) {
        this.tenbenh = tenbenh;
        this.tennguoibenh = tennguoibenh;
        this.thongtinnguoibenh = thongtinnguoibenh;
        this.motabenh = motabenh;
    }

    public String getTenbenh() {
        return tenbenh;
    }

    public void setTenbenh(String tenbenh) {
        this.tenbenh = tenbenh;
    }

    public String getTennguoibenh() {
        return tennguoibenh;
    }

    public void setTennguoibenh(String tennguoibenh) {
        this.tennguoibenh = tennguoibenh;
    }

    public String getThongtinnguoibenh() {
        return thongtinnguoibenh;
    }

    public void setThongtinnguoibenh(String thongtinnguoibenh) {
        this.thongtinnguoibenh = thongtinnguoibenh;
    }

    public String getMotabenh() {
        return motabenh;
    }

    public void setMotabenh(String motabenh) {
        this.motabenh = motabenh;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
