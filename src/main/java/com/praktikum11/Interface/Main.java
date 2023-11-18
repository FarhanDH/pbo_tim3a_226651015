package com.praktikum11.Interface;

import com.praktikum11.Interface.bangun_datar.Lingkaran;
import com.praktikum11.Interface.bangun_datar.Persegi;

public class Main {
    public static void main(String[] args) {
//        Persegi
        double p = new Persegi(4).getLuas();
        System.out.println(p);

//        Lingkaran
        double l = new Lingkaran(4).getLuas();
        System.out.println(l);
    }
}
