package com.praktikum6.inheritance;

public class Assisten extends Mahasiswa {
    private int JamAsistensi = 15;

    public Assisten(String nama, String nim) {
        super(nama, nim);
    }

    public Assisten() {
    }

    @Override
    public int getJamBelajar() { // mengubah method getJamBelajar
        return super.getJamBelajar() + this.JamAsistensi;
    }
}