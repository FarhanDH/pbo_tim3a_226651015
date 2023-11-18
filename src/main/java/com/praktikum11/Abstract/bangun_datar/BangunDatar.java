package com.praktikum11.Abstract.bangun_datar;

public abstract class BangunDatar {
    String jenisBangunDatar;

    public BangunDatar(String jenisBangunDatar) {
        this.jenisBangunDatar = jenisBangunDatar;
    }

    public BangunDatar() {
        this.jenisBangunDatar = "";
    }

    public String getJenisBangunDatar() {
        return jenisBangunDatar;
    }

    public void setJenisBangunDatar(String jenisBangunDatar) {
        this.jenisBangunDatar = jenisBangunDatar;
    }

    /**
     * Returns the area of the shape.
     *
     * @return the area of the shape as a double value
     */
    public abstract double getLuas();

    /**
     * Returns the circumference of the shape.
     *
     * @return the circumference of the shape as a double value
     */
    public abstract double getKeliling();
}
