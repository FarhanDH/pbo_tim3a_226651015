package com.praktikum7.vehicles;

public class Kendaraan {
    private String nomorPolisi;
    private String pemilik;

    public Kendaraan() {
        this.nomorPolisi = "";
        this.pemilik = "";
    }

    public Kendaraan(String nomorPolisi, String pemilik) {
        this.nomorPolisi = nomorPolisi;
        this.pemilik = pemilik;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public void setNomorPolisi(String nomorPolisi) {
        this.nomorPolisi = nomorPolisi;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public void setGantiPemilik(String gantiPemilik) {
        this.pemilik = gantiPemilik;
    }

    public void showData() {
        System.out.println("Nomor Polisi\t: " + this.nomorPolisi);
        System.out.println("Pemilik\t\t: " + this.pemilik);
    }
}
