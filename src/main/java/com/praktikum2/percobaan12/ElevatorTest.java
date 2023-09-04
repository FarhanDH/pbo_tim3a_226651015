package com.praktikum2.percobaan12;

class Elevator {

    /** Creates a new instance of Elevator */
    public boolean pintuTerbuka = false;
    public int lantaiSaatIni = 3;
    public final int maxLantai = 10;
    public final int minLantai = 1;

    public void bukaPintu() {
        System.out.println("buka pintu");
        pintuTerbuka = true;
        System.out.println("pintu terbuka");
    }

    public void tutupPintu() {
        System.out.println("tutup pintu");
        pintuTerbuka = false;
        System.out.println("pintu tertutup");
    }

    public void naik() {
        System.out.println("naik satu lantai");
        lantaiSaatIni++;
        System.out.println("lantai: " + lantaiSaatIni);
    }

    public void turun() {
        System.out.println("turun satu lantai");
        lantaiSaatIni--;
        System.out.println("lantai: " + lantaiSaatIni);
    }
}

public class ElevatorTest {
    public static void main(String args[]) {
        Elevator e = new Elevator();
        e.bukaPintu();
        e.tutupPintu();
        e.turun();
        e.naik();
        e.naik();
        e.naik();
        e.bukaPintu();
        e.tutupPintu();
        e.turun();
        e.bukaPintu();
        e.turun();
        e.bukaPintu();
    }
}
