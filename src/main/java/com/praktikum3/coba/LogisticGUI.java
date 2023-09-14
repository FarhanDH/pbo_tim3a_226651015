package com.praktikum3.coba;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import javax.swing.JOptionPane;

public class LogisticGUI {
    public static void main(String[] args) {
        int weight;
        int distance;
        int cost = 0;

        weight = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Berat (Masukkan dengan satuan Kg!): "));
        distance = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jarak(Masukkan dengan satuan Km!): "));

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
        JOptionPane.showMessageDialog(null, "biaya pengiriman logistik: Rp. " + formatRibuan);
    }
}
