package com.praktikum7.vehicles;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil() {
        super();
        this.jumlahPintu = 0;
    }

    public Mobil(String nomorPolisi, String pemilik, int jumlahPintu) {
        super(nomorPolisi, pemilik);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void showData() {
        System.out.println("\nJenis\t\t: Ini Mobil");
        super.showData();
        System.out.println("Jumlah pintu\t: " + this.jumlahPintu);
    }
}
