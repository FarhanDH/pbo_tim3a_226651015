package com.praktikum5._7_4_2_constructor_overload;

public class Kotak {
    double panjang;
    double lebar;
    double tinggi;

    // Mendefinisikan constructor tanpa parameter
    Kotak() {
        panjang = 4;
        lebar = 3;
        tinggi = 2;
    }

    // Mendefinisikan constructor dengan satu parameter
    Kotak(double p) {
        panjang = p;
        lebar = 3;
        tinggi = 2;
    }

    // Mendefinisikan constructor dengan tiga parameter
    Kotak(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    double hitungVolume() {
        return (panjang * lebar * tinggi);
    }
}
