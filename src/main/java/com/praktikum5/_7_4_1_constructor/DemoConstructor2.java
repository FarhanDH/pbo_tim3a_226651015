package com.praktikum5._7_4_1_constructor;

public class DemoConstructor2 {
    public static void main(String[] args) {
        Kotak k1, k2;
        k1 = new Kotak(4, 3, 2);
        k2 = new Kotak(6, 5, 4);
        System.out.println("Volume k1 = " + k1.hitungVolume());
        System.out.println("Volume k2 = " + k2.hitungVolume());
    }
}
