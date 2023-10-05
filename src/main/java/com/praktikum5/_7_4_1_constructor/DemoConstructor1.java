package com.praktikum5._7_4_1_constructor;

class DemoConstructor1 {
    public static void main(String[] args) {
        Kotak k1, k2;
        k1 = new Kotak();
        k2 = new Kotak();
        System.out.println("Volume k1 = " + k1.hitungVolume());
        System.out.println("Volume k2 = " + k2.hitungVolume());
    }
}