package com.praktikum9.shirt;

public class ConstructorShirt2 {

    // private int idBaju = 0; // ID default untuk baju

    // private String keterangan = "-Keterangan Diperlukan-"; // default

    // Kode warna R=Merah, G=Hijau, B=Biru, U=Tidak Ditentukan
    private char kodeWarna = 'U';
    // private double harga = 0.0; // Harga default untuk semua barang
    private int jmlStok = 0; // Default untuk
                             // jumlah barang

    public ConstructorShirt2() {
        kodeWarna = 'R';
    }

    public ConstructorShirt2(char kodeAwal) {
        switch (kodeAwal) {
            case 'R':

            case 'G':

            case 'B':

                kodeWarna = kodeAwal;
                break;
            default:

                System.out.println("kodeWarna salah, gunakan R, G, atau B");

        }

    }

    public ConstructorShirt2(char kodeAwal, int jmlAwal) {
        switch (kodeAwal) {
            case 'R':

            case 'G':

            case 'B':

                kodeWarna = kodeAwal;
                break;
            default:

                System.out.println("kodeWarna salah, gunakan R, G, atau B");

        }

        if (jmlAwal > 0 && jmlAwal < 2000) {
            jmlStok = jmlAwal;
        } else {

            System.out.println("Jumlah salah. harus diantara 0 - 2000");
        }

    }

    public char getKodeWarna() {
        return kodeWarna;
    }

    public int getJmlStok() {
        return jmlStok;

    }
}// akhir kelas