package com.praktikum4.soal_praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

public class CostAlatBerat {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String lokasi = "",
                jenisUnit = "";
        int jumlahJam = 0,
                upahMakan = 0,
                upahTransport = 0,
                tagihan = 0,
                biayaSewa = 0,
                totalHari = 0;

        try {
            System.out.print("\nmasukkan lokasi: ");
            lokasi = dataIn.readLine().toLowerCase();
            System.out.print("masukkan jenis unit: ");
            jenisUnit = dataIn.readLine().toLowerCase();
            System.out.print("masukkan jumlah jam: ");
            jumlahJam = Integer.parseInt(dataIn.readLine());
            System.out.print("masukkan total hari: ");
            totalHari = Integer.parseInt(dataIn.readLine());

            if (lokasi.equals("samarinda")) {
                upahMakan += 50000;
                upahTransport += 25000;
                if (jenisUnit.equals("excavator")) {
                    biayaSewa += 235000;
                } else if (jenisUnit.equals("vibro")) {
                    biayaSewa += 215000;
                } else if (jenisUnit.equals("dozer")) {
                    biayaSewa += 275000;
                }
            } else if (lokasi.equals("tenggarong")) {
                upahMakan += 70000;
                upahTransport += 50000;
                if (jenisUnit.equals("excavator")) {
                    biayaSewa += 255000;
                } else if (jenisUnit.equals("vibro")) {
                    biayaSewa += 235000;
                } else if (jenisUnit.equals("dozer")) {
                    biayaSewa += 295000;
                }
            } else {
                upahMakan += 100000;
                upahTransport += 70000;
                if (jenisUnit.equals("excavator")) {
                    biayaSewa += 285000;
                } else if (jenisUnit.equals("vibro")) {
                    biayaSewa += 265000;
                } else if (jenisUnit.equals("dozer")) {
                    biayaSewa += 345000;
                }
            }

            if (jumlahJam <= 200) {
                jumlahJam = 200;
            }

            tagihan = ((jumlahJam * biayaSewa) + (totalHari * (upahMakan + upahTransport)));

            Locale indonesiaLocale = new Locale("id", "ID");
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(indonesiaLocale);
            String biayaSewaRupiah = "Biaya Sewa Per Jam: " + currencyFormatter.format(biayaSewa);
            String upahMakanRupiah = "\nUpah makan Per Hari: " + currencyFormatter.format(upahMakan);
            String upahTransportRupiah = "\nUpah transport Per Hari: " + currencyFormatter.format(upahTransport);
            String tagihanRupiah = "\n\nTagihan anda sebesar: " + currencyFormatter.format(tagihan);

            // Display Tagihan
            System.out.println("-------------------------");
            System.out.println(
                    "BERIKUT DETAIL PESANAN ANDA \n\n" +
                            biayaSewaRupiah +
                            upahMakanRupiah +
                            upahTransportRupiah +
                            "\nTotal jam setelah pembulatan: " +
                            jumlahJam +
                            "\nTotal hari kerja: " +
                            totalHari +
                            tagihanRupiah);
        } catch (IOException e) {
            System.out.println("Input Tidak Valid");
        }
    }
}
