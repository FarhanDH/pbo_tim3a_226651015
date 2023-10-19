package com.praktikum6.inheritance;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int jamBelajar = 40;

    Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public int getJamBelajar() {
        return jamBelajar;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}
