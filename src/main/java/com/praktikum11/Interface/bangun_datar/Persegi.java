package com.praktikum11.Interface.bangun_datar;

public class Persegi implements BangunDatar {

    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    /**
     * Calculates the area of a square.
     *
     * @return the area of the square
     */
    @Override
    public double getLuas() {
        return this.sisi * this.sisi;
    }

    /**
     * Calculates the circumference of a square.
     *
     * @return the circumference of the square
     */
    @Override
    public double getKeliling() {
        return this.sisi * 4;
    }

}
