package com.praktikum5._7_3_method;

import javax.swing.JOptionPane;

public class DemoMethod1 {
    public static void main(String[] args) {
        Kotak k1, k2, k3;

        // instansiasi objek
        k1 = new Kotak();
        k2 = new Kotak();
        k3 = new Kotak();

        // mengisi data untuk objek k1
        k1.panjang = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan panjangnya"));
        k1.lebar = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan lebarnya"));
        ;
        k1.tinggi = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan tingginya"));
        ;

        // mengisi data untuk objek k2
        k2.panjang = 6;
        k2.lebar = 5;
        k2.tinggi = 4;

        // mengisi data untuk objek k3
        k3.panjang = 8;
        k3.lebar = 7;
        k3.tinggi = 6;

        // memanggil method cetakVolume() untuk masing-masing objek
        JOptionPane.showMessageDialog(null, k1.hitungVolume());
        k2.cetakVolume();
        k3.cetakVolume();
    }
}