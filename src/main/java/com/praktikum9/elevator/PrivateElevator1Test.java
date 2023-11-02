package com.praktikum9.elevator;

public class PrivateElevator1Test {

    public static void main(String args[]) {

        // PrivateElevator1 privElevator = new PrivateElevator1();
        /*************************************************
         * 
         * Baris kode dibawah ini tidak akan di-compile *
         * karena berusaha untuk mengakses variabel
         * 
         * private
         ************************************************/
        // privElevator.bukaPintu = true; // penumpang masuk privElevator.bukaPintu =
        // false; //pintu ditutup
        // pergi ke lantai 0 dibawah gedung privElevator.lantaiSkrg--;
        // privElevator.lantaiSkrg++;

        // lompat ke lantai 7 (hanya ada 5 lantai dalam gedung) privElevator.lantaiSkrg
        // = 7;
        // privElevator.bukaPintu = true; // penumpang masuk/keluar
        // privElevator.bukaPintu = false;
        // privElevator.lantaiSkrg = 1; // menuju lantai pertama privElevator.bukaPintu
        // = true; //penumpang masuk/keluar
        // privElevator.lantaiSkrg++; //elevator bergerak tanpa menutup pintu
        // privElevator.bukaPintu = false;
        // privElevator.lantaiSkrg--;
        // privElevator.lantaiSkrg--;
    }
}