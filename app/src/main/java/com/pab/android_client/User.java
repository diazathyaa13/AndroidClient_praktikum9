package com.pab.android_client;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;

    @SerializedName("nim")
    private String nim;

    @SerializedName("telepon")
    private String telepon;

    @SerializedName("agama")
    private String agama;

    // Konstruktor untuk membuat objek User baru


    public User(int id, String name, String email, String nim, String telepon, String agama) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.nim = nim;
        this.telepon = telepon;
        this.agama = agama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }
}

