package com.praktikum8;

public class Main {
    public static void main(String[] args) {
        Pelanggan pelanggan = new Member("12-12-2012", "12:12", "123", "1", "A", "B");

        /**
         * calls a method from the subclass instead of the
         * superclass, because this method overrides the method from
         * the super class
         */
        System.out.println(pelanggan.getData());
    }
}
