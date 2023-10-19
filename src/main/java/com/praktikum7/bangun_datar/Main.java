package com.praktikum7.bangun_datar;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(4, "Persegi");
        Lingkaran lingkaran = new Lingkaran();

        System.out.println("Luas Persegi : " + persegi.getLuas());
        System.out.println("Luas Lingkaran : " + lingkaran.getDiameter());
    }
}
