package com.praktikum3.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogisticConsole {
    /**
     * A function that calculates the cost of shipping based on the weight and
     * distance.
     *
     * @param args the command-line arguments
     * @return void
     */
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
            System.out.println("Biaya pengiriman logistik: Rp. " + cost);
        } catch (IOException e) {
            System.out.println("Data tidak valid");
        }
    }
}
