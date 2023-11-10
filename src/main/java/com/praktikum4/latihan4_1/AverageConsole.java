package com.praktikum4.latihan4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageConsole {
    /**
     * Main function that reads three user input values, calculates the average,
     * and prints a message based on the average value.
     *
     * @param args the command-line arguments
     * @return void
     */
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int[] nilaiUser = new int[3];
        double result = 0;

        try {
            for (int i = 0; i < 3; i++) {
                System.out.print("MASUKKIN NILAI KE-" + (i + 1) + ": ");
                nilaiUser[i] = Integer.parseInt(input.readLine());
            }

            for (int num : nilaiUser) {
                result += num;
            }
            result /= nilaiUser.length;

            if (result >= 60) {
                System.out.println("RATA-RATA KAMU: " + result + " 😉 \nENGGAK USAH SOMBONGGGG!!!! 〴⋋_⋌〵");
            } else {
                System.out.println("RATA-RATA KAMU: " + result + " 😥 \nBELAJAR YANG BENEEER MAKANYAA!!!! 〴⋋_⋌〵");
            }
        } catch (IOException e) {
            System.out.println("Input Tidak Valid");
        }
    }
}
