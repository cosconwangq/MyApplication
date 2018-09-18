package com.example.wangq.myapplication.model;

public class Content {
    private String imgUrl;
    private String titile;
    private String date;

    public Content(String imgUrl, String titile, String date) {
        this.imgUrl = imgUrl;
        this.titile = titile;
        this.date = date;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
