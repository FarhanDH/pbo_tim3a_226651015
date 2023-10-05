package com.praktikum5._7_4_2_constructor_overload;

public class DemoOverloadConstructor {
    public static void main(String[] args) {
        Kotak k1, k2, k3;
        k1 = new Kotak();
        k2 = new Kotak(10);
        k3 = new Kotak(4, 3, 2);
        // Menampilkan volume dari masing-masing objek Kotak
        System.out.println("Volume k1 = " + k1.hitungVolume());
        System.out.println("Volume k2 = " + k2.hitungVolume());
        System.out.println("Volume k3 = " + k3.hitungVolume());
    }
}
