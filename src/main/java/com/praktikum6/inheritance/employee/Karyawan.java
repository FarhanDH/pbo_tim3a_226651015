package com.praktikum6.inheritance.employee;

public class Karyawan {
    // atribut atau variable
    private String namaKary;
    private String alamatKary;
    private String jenisKel;

    // method
    public Karyawan() {
        this.namaKary = "";
        this.alamatKary = "";
        this.jenisKel = "";
    }

    public Karyawan(String namaKary, String alamatKary, String jenisKel) {
        this.namaKary = namaKary;
        this.alamatKary = alamatKary;
        this.jenisKel = jenisKel;
    }

    public String getNamaKary() {
        return namaKary;
    }

    public void setNamaKary(String namaKary) {
        this.namaKary = namaKary;
    }

    public String getAlamatKary() {
        return alamatKary;
    }

    public void setAlamatKary(String alamatKary) {
        this.alamatKary = alamatKary;
    }

    public String getJenisKel() {
        return jenisKel;
    }

    public void setJenisKel(String jenisKel) {
        this.jenisKel = jenisKel;
    }

    public void showData() {
        System.out.println("Nama        : " + this.namaKary);
        System.out.println("Alamat      : " + this.alamatKary);
        System.out.println("Jenis Kel   : " + this.jenisKel);
    }
}
