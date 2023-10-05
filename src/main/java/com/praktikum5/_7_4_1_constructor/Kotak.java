package com.praktikum5._7_4_1_constructor;

public class Kotak {
    double panjang;
    double lebar;
    double tinggi;

    // Mendefinisikan constructor tanpa param
    Kotak() {
        panjang = 4;
        lebar = 3;
        tinggi = 2;
    }

    // Mendefinisikan constructor dengan param
    Kotak(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    double hitungVolume() {
        return (panjang * lebar * tinggi);
    }
}
