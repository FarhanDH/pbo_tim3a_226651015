package com.praktikum3.coba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class LogisticConsole {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int weight;
        int distance;
        int cost = 0;
        try {
            System.out.print("masukkan berat (Masukkan dengan satuan Kg): ");
            weight = Integer.parseInt(dataIn.readLine());
            System.out.print("masukkan jarak (Masukkan dengan satuan Km): ");
            distance = Integer.parseInt(dataIn.readLine());

            // increase costs based on weight and distance
            if (weight <= 1) {
                cost += 5000;
                if (distance <= 10) {
                    cost += 2000;
                } else {
                    cost += 5000;
                }
            } else {
                cost += 10000;
                if (distance <= 10) {
                    cost += 2000;
                } else {
                    cost += 5000;
                }
            }

            // create objek DecimalFormat with the appropriate pattern
            DecimalFormat df = new DecimalFormat("#,###");

            // Set the thousands separator symbol to a period
            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
            symbols.setGroupingSeparator('.');
            df.setDecimalFormatSymbols(symbols);

            // Convert integer to "100.000"
            String formatRibuan = df.format(cost);

            // display logistic delivery cost
            System.out.println("Biaya pengiriman logistik: Rp. " + formatRibuan);
        } catch (IOException e) {
            System.out.println("Data tidak valid");
        }
    }
}
