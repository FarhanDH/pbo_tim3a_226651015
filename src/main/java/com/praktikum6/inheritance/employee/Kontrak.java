package com.praktikum6.inheritance.employee;

public class Kontrak extends Karyawan {
    // create private attribute NIK, tahunKontrak, masaKontrak
    private String NIK;
    private String tahunKontrak;
    private String masaKontrak;

    public Kontrak() {
        super();
        this.NIK = "";
        this.tahunKontrak = "";
        this.masaKontrak = "";
    }

    public Kontrak(
            String NIK,
            String tahunKontrak,
            String masaKontrak,
            String namaKary,
            String alamatKary,
            String jenisKel) {
        super(namaKary, alamatKary, jenisKel);
        this.NIK = NIK;
        this.tahunKontrak = tahunKontrak;
        this.masaKontrak = masaKontrak;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getTahunKontrak() {
        return tahunKontrak;
    }

    public void setTahunKontrak(String tahunKontrak) {
        this.tahunKontrak = tahunKontrak;
    }

    public String getMasaKontrak() {
        return masaKontrak;
    }

    public void setMasaKontrak(String masaKontrak) {
        this.masaKontrak = masaKontrak;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("NIK: " + this.NIK);
        System.out.println("Tahun Kontrak: " + this.tahunKontrak);
        System.out.println("Masa Kontrak: " + this.masaKontrak);
    }
}
