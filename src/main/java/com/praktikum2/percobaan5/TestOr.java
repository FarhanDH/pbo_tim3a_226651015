package com.praktikum2.percobaan5;

public class TestOr {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test = false;
        // demonstrasi ||
        test = (i < 10) || (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        // demonstrasi |
        test = (i < 10) | (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
