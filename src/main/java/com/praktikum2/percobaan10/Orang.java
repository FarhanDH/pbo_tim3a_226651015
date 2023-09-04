package com.praktikum2.percobaan10;

public class Orang {
    /** Membuat instance baru dari Orang */
    public int tahunUmur = 32;

    public void hitungUmur() {
        int hariUmur = tahunUmur * 365;
        long detikUmur = tahunUmur * 365 * 24L * 60 * 60;

        System.out.println("umur anda adalah: " + hariUmur + "hari");
        System.out.println("umur anda adalah: " + detikUmur + "detik");
    }

    public static void main(String[] args) {
        Orang o = new Orang();
        o.hitungUmur();
    }
}
