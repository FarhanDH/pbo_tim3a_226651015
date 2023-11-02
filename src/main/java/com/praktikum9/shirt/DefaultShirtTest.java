package com.praktikum9.shirt;

public class DefaultShirtTest {

    public static void main(String[] args) {
        DefaultShirt defShirt = new DefaultShirt();
        char kodeWarna;
        kodeWarna = defShirt.getKodeWarna();
        System.out.println("Kode Warna: " + kodeWarna);
    }

}
