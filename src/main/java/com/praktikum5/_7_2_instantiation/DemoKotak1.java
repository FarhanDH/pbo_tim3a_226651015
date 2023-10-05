package com.praktikum5._7_2_instantiation;

public class DemoKotak1 {
    public static void main(String[] args) {
        double volume;
        Kotak k = new Kotak();

        // Mengisikan nilai ke dalan data-data kelas Kotak
        k.panjang = 4;
        k.lebar = 3;
        k.tinggi = 2;

        // Menghitung isi/volume kotak
        volume = k.panjang * k.tinggi * k.lebar;

        // Menampilkan nilai volume ke layar nonitor
        System.out.println(" Volume kotak = " + volume);
    }
}
