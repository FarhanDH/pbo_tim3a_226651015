package com.praktikum4.soal_praktikum;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class CostAlatBeratGUI {
    public static void main(String[] args) {
        String lokasi, jenisUnit;
        int jumlahJam = 0,
                upahMakan = 0,
                upahTransport = 0,
                tagihan = 0,
                biayaSewa = 0,
                totalHari = 0;

        // TODO: Get data from user
        lokasi = JOptionPane.showInputDialog("MASUKKIN LOKASI PAMAKAIAANNN!!!").toLowerCase();
        jenisUnit = JOptionPane.showInputDialog("MASUKKIN JENISS UNITT!!!!").toLowerCase();
        jumlahJam = Integer.parseInt(JOptionPane.showInputDialog("MASUKKIN JUMLAH JAM PEMAKAAIAAANNNN!!!"));
        totalHari = Integer.parseInt(JOptionPane.showInputDialog("MASUKKIN TOTAL HARI PEMAKAAIAAANNNN!!!"));

        // TODO: Validate based lokasi & jenisUnit
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

        // TODO: Validate based jumlah jam
        if (jumlahJam <= 200) {
            jumlahJam = 200;
        }

        // TODO: Calculating bills
        tagihan = ((jumlahJam * biayaSewa) + (totalHari * (upahMakan + upahTransport)));

        // TODO: Get Indonesia currency
        Locale indonesiaLocale = new Locale("id", "ID");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(indonesiaLocale);
        String biayaSewaRupiah = "BIAYA SEWA PER JAMNYAA: " + currencyFormatter.format(biayaSewa);
        String upahMakanRupiah = "\nUPAH MAKAN PER HARIII: " + currencyFormatter.format(upahMakan);
        String upahTransportRupiah = "\nUPAH TRANSPORT PER HARII: " + currencyFormatter.format(upahTransport);
        String tagihanRupiah = "\n\nTAGIHAN KAMU SEBESARRR: " + currencyFormatter.format(tagihan);

        // Display Tagihan
        JOptionPane.showMessageDialog(
                null,
                "DETAIL PESANANNYA DIBAWAAAAHHH!!! \n\n" +
                        biayaSewaRupiah +
                        upahMakanRupiah +
                        upahTransportRupiah +
                        "\nTOTAL JAMNYAAAAA: " +
                        jumlahJam +
                        "\nTOTAL HARI HARINYAAA: " +
                        totalHari +
                        tagihanRupiah);
    }
}
