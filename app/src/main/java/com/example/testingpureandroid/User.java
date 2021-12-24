package com.example.testingpureandroid;


import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("username")
    private String userName;
    private String email;

    //Create getters for userName and email


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}