package com.praktikum6.inheritance.employee;

public class Permanen extends Karyawan {
    // atribut
    private String NIP;
    private String tahunBergabung;
    private String posisi;

    // methods
    public Permanen() {
        super();
        this.NIP = "";
        this.tahunBergabung = "";
        this.posisi = "";
    }

    public Permanen(
            String NIP,
            String tahunBergabung,
            String posisi,
            String namaKary,
            String alamatKary,
            String jenisKel) {
        super(namaKary, alamatKary, jenisKel);
        this.NIP = NIP;
        this.tahunBergabung = tahunBergabung;
        this.posisi = posisi;
    }

    public Permanen(String NIP, String tahunBergabung, String posisi) {
        this.NIP = NIP;
        this.tahunBergabung = tahunBergabung;
        this.posisi = posisi;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getTahunBergabung() {
        return tahunBergabung;
    }

    public void setTahunBergabung(String tahunBergabung) {
        this.tahunBergabung = tahunBergabung;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    @Override
    public void showData() {
        super.showData(); // Generated from
                          // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("NIP         : " + this.NIP);
        System.out.println("Tahun Gabung    : " + this.tahunBergabung);
        System.out.println("Posisi      : " + this.posisi);
    }

}
