package com.praktikum7.bangun_datar;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        super();
        this.sisi = 0.0;
    }

    public Persegi(double sisi, String jenisBangunDatar) {
        super(jenisBangunDatar);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }
}
