package com.praktikum3.challenge;

import javax.swing.JOptionPane;

public class LogisticGUI {
    /**
     * A function that calculates the cost of shipping based on the weight and
     * distance.
     *
     * @param args the command-line arguments
     * @return void
     */
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
        JOptionPane.showMessageDialog(null, "biaya pengiriman logistik: Rp. " + cost);
    }
}
