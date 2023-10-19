package com.praktikum6.overriding;

public class SubKelas extends KelasSuper {
    public void methodAsli() {
        System.out.println("Method yg overrided jalan");
    }

    public void methodPemanggil() {
        System.out.println("Method pemanggil methodAsli jln");
        super.methodAsli(); // yg dipanggil milik kelas super
    }

    public static void main(String[] args) {
        SubKelas osk = new SubKelas();
        osk.methodAsli();
        osk.methodPemanggil();
    }
}
