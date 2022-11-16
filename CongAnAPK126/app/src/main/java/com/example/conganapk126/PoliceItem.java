package com.example.conganapk126;

public class PoliceItem {
    private String txtName, txtRank, txtWorkPlace, txtCountry;
    private int txtStar, img;

    public PoliceItem(String txtName, String txtRank, String txtWorkPlace, String txtCountry, int txtStar, int img) {
        this.txtName = txtName;
        this.txtRank = txtRank;
        this.txtWorkPlace = txtWorkPlace;
        this.txtCountry = txtCountry;
        this.txtStar = txtStar;
        this.img = img;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String getTxtRank() {
        return txtRank;
    }

    public void setTxtRank(String txtRank) {
        this.txtRank = txtRank;
    }

    public String getTxtWorkPlace() {
        return txtWorkPlace;
    }

    public void setTxtWorkPlace(String txtWorkPlace) {
        this.txtWorkPlace = txtWorkPlace;
    }

    public String getTxtCountry() {
        return txtCountry;
    }

    public void setTxtCountry(String txtCountry) {
        this.txtCountry = txtCountry;
    }

    public int getTxtStar() {
        return txtStar;
    }

    public void setTxtStar(int txtStar) {
        this.txtStar = txtStar;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}

