package com.praktikum11.Interface.bangun_datar;

public class Lingkaran implements BangunDatar {
    private double diameter;

    public Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**
     * Calculates the area of a circle.
     *
     * @return the area of the circle
     */
    @Override
    public double getLuas() {
        return Math.PI * (this.diameter / 2) * (this.diameter / 2);
    }

    /**
     * Calculates the circumference of a circle.
     *
     * @return the circumference of the circle
     */
    @Override
    public double getKeliling() {
        return Math.PI * this.diameter;
    }
}
