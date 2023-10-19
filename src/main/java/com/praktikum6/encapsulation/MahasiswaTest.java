package com.praktikum6.encapsulation;

class MahasiswaTest {
    public static void main(String[] args) {
        Mahasiswa objMhs;
        String localNama, localNim;
        objMhs = new Mahasiswa("Andriani", "123456");
        objMhs.setAlamat("Watugong 212 Malang");
        localNama = objMhs.getNama();
        localNim = objMhs.getNim();
        System.out.println("Nama : " + localNama);
        System.out.println("NIM : " + localNim);
    }
}
