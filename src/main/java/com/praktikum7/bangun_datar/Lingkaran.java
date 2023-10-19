package com.praktikum7.bangun_datar;

public class Lingkaran extends BangunDatar {
    private double diameter;

    public Lingkaran() {
        super();
        this.diameter = 0.0;
    }

    public Lingkaran(double diameter, String jenisBangunDatar) {
        super(jenisBangunDatar);
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getLuas() {
        return Math.PI * (diameter / 2) * (diameter / 2);
    }

    public double getKeliling() {
        return Math.PI * diameter;
    }
}
