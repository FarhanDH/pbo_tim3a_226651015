package com.praktikum5._7_3_method;

public class Kotak {
    double panjang;
    double lebar;
    double tinggi;

    // Mendefinisiken method void (tidak mengembalikan nilai)
    void cetakVolume() {
        System.out.println("Volume kotak = " + (panjang * lebar * tinggi));
    }

    // Mendefinisiken method double (mengembalikan nilai)
    double hitungVolume() {
        double vol = panjang * lebar * tinggi;
        return vol;
    }
}