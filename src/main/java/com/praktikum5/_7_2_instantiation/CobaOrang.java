package com.praktikum5._7_2_instantiation;

public class CobaOrang {
    public static void main(String[] args) {
        Orang O = new Orang();
        // Mengisikan nilai ke dalam data-data kelas Orang
        O.nama = "Putri Mahadewi";
        O.alamat = "Jl. Pemuda 113 Magelang";
        O.no_telp = "0293-360345";
        // Menampilkan data Orang
        System.out.println("DATA ORANG");
        System.out.println("=========================");
        System.out.println("NAMA = " + O.nama);
        System.out.println("ALAMAT = " + O.alamat);
        System.out.println("NO.TELP = " + O.no_telp);
    }
}
