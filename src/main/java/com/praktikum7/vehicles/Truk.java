package com.praktikum7.vehicles;

public class Truk extends Kendaraan {
    private int jumlahRoda;

    public Truk() {
        super();
        this.jumlahRoda = 0;
    }

    public Truk(String nomorPolisi, String pemilik, int jumlahRoda) {
        super(nomorPolisi, pemilik);
        this.jumlahRoda = jumlahRoda;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("\nJenis\t\t: Ini Truk");
        System.out.println("Jumlah Roda\t: " + this.jumlahRoda);
    }
}
