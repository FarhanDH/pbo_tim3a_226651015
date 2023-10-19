package com.praktikum6.encapsulation;

public class Mahasiswa {
    // deklarasi private attribute
    private String nama;
    private String nim;
    private String alamat;

    public Mahasiswa() {
        this.nama = "";
        this.nim = "";
        this.alamat = "";
    }

    // Constructor dengan dua input parameter
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Constructor dengan tiga input parameter
    public Mahasiswa(String nama, String nim, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
    }

    // mengakses atribut alamat
    public String getAlamat() {
        return alamat;
    }

    // mengakses atribut nama
    public String getNama() {
        return nama;
    }

    // mengakses attribut nim
    public String getNim() {
        return nim;
    }

    // mengisi atribut alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
