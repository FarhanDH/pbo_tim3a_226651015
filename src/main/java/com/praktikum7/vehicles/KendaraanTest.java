package com.praktikum7.vehicles;

public class KendaraanTest {
    public static void main(String[] args) {
        Truk mobil1 = new Truk("AB 123 CD", "John Doe", 4);
        Truk truk2 = new Truk("AB 123 CD", "John Doe", 6);
        Motor motor3 = new Motor("AB 123 CD", "John Doe", 2);

        Kendaraan[] kendaraanku = { mobil1, truk2, motor3 };

        for (Kendaraan kendaraan : kendaraanku) {

            if (kendaraan instanceof Mobil) {
                System.out.println("\nJenis kendaraan: Mobil");
                Mobil mobil = (Mobil) kendaraan;
                System.out.println("Jumlah pintu: " + mobil.getJumlahPintu());
            } else if (kendaraan instanceof Truk) {
                System.out.println("\nJenis kendaraan: Truk");
                Truk truk = (Truk) kendaraan;
                System.out.println("Jumlah roda: " + truk.getJumlahRoda());
            } else if (kendaraan instanceof Motor) {
                System.out.println("\nJenis kendaraan: Motor");
                Motor sm = (Motor) kendaraan;
                System.out.println("Jumlah tak: " + sm.getJumlahTak());
            }
        }
    }
}
