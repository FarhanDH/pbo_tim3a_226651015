package com.praktikum5._7_3_2_method_overload;

public class Pembagian {
    int bagi(int a, int b) {
        return a / b;
    }

    double bagi(double a, double b) {
        return a / b;
    }
}

class DemoOverload1 {
    public static void main(String[] args) {
        Pembagian b = new Pembagian();
        int x = b.bagi(10, 4);
        double y = b.bagi(10.0, 4.0);
        System.out.println("Hasil bagi tipe int = " + x);
        System.out.println("Hasil bagi tipe double = " + y);
    }
}
