package com.praktikum11.Abstract.bangun_datar;

public class Lingkaran extends BangunDatar {
    private double diameter;

    public Lingkaran() {
        super("Lingkaran");
    }

    public Lingkaran(double diameter) {
        super("Lingkaran");
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
