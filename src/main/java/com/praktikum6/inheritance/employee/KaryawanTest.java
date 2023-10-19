package com.praktikum6.inheritance.employee;

public class KaryawanTest {
    public static void main(String[] args) {
        Permanen p = new Permanen("1983978194", "2007", "Dosen", "Jefry", "Balikpapan", "Pria");
        Permanen p1 = new Permanen("199453455", "2023", "Maling");
        p1.setNamaKary("Deny");
        p1.setAlamatKary("Bontang");
        p1.setJenisKel("Pria");

        Kontrak p2 = new Kontrak("909090909", "1945", "3", "Joko", "Akhirat", "nonbinary");

        System.out.println("===== DATA 1 =====");
        p.showData();
        System.out.println("==================");
        System.out.println("===== DATA 2 =====");
        p1.showData();
        System.out.println("==================");
        System.out.println("===== DATA 3 =====");
        p2.showData();
        System.out.println("==================");
    }
}
