package com.praktikum9.shirt;

public class PrivateShirt1Test {
    public static void main(String[] args) {
        PrivateShirt1 privShirt = new PrivateShirt1();
        char kodeWarna;
        // Mengisi kode warna yang valid
        privShirt.setKodeWarna('R');
        kodeWarna = privShirt.getKodeWarna();
        // Kelas PrivateShirt1Test bisa mengisi sebuah kodeWarna yang valid
        System.out.println("Kode Warna: " + kodeWarna);
        // Mengisi kode warna yang salah
        privShirt.setKodeWarna('Z');
        kodeWarna = privShirt.getKodeWarna();
        // Kelas PrivateShirt1Test bisa mengisi sebuah kodeWarna yang salah
        System.out.println("Kode Warna: " + kodeWarna);
    }

}