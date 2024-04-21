package com.example.telegrambotgetcurrencypb.model;


import java.sql.Date;

public class CurrencyModel {


    Integer cur_ID;
    String date;
    String cur_Abbreviation;
    Integer cur_Scale;
    String cur_Name;
    Double cur_OfficialRate;

    public Integer getCur_ID() {
        return cur_ID;
    }

    public void setCur_ID(Integer cur_ID) {
        this.cur_ID = cur_ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCur_Abbreviation() {
        return cur_Abbreviation;
    }

    public void setCur_Abbreviation(String cur_Abbreviation) {
        this.cur_Abbreviation = cur_Abbreviation;
    }

    public Integer getCur_Scale() {
        return cur_Scale;
    }

    public void setCur_Scale(Integer cur_Scale) {
        this.cur_Scale = cur_Scale;
    }

    public String getCur_Name() {
        return cur_Name;
    }

    public void setCur_Name(String cur_Name) {
        this.cur_Name = cur_Name;
    }

    public Double getCur_OfficialRate() {
        return cur_OfficialRate;
    }

    public void setCur_OfficialRate(Double cur_OfficialRate) {
        this.cur_OfficialRate = cur_OfficialRate;
    }
}
