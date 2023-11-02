package com.praktikum9.shirt;

public class DefaultShirt {

    // private int idBaju = 0; // ID default untuk baju

    // private String keterangan = "-Keterangan Diperlukan-"; // default

    // Kode warna R=Merah, G=Hijau, B=Biru, U=Tidak Ditentukan
    private char kodeWarna = 'U';
    // private double harga = 0.0; // Harga default untuk semua barang private int
    // jmlStok = 0; //Default untuk
    // jumlah barang

    public DefaultShirt() {
        kodeWarna = 'R';
    }

    public char getKodeWarna() {
        return kodeWarna;

    }

} // akhir kelas