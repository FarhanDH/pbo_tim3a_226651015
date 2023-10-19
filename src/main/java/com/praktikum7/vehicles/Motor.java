package com.praktikum7.vehicles;

public class Motor extends Kendaraan {
    private int jumlahTak;

    public Motor() {
        super();
        this.jumlahTak = 0;
    }

    public Motor(String nomorPolisi, String pemilik, int jumlahTak) {
        super(nomorPolisi, pemilik);
        this.jumlahTak = jumlahTak;
    }

    public int getJumlahTak() {
        return jumlahTak;
    }

    public void setJumlahTak(int jumlahTak) {
        this.jumlahTak = jumlahTak;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("\nJenis\t\t: Ini Motor");
        System.out.println("Jumlah Tak\t: " + this.jumlahTak);
    }
}
