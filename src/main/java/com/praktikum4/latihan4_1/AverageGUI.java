package com.praktikum4.latihan4_1;

import javax.swing.JOptionPane;

public class AverageGUI {
    /**
     * A method to calculate and display the average of three user-inputted numbers.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int[] nilaiUser = new int[3];
        double result = 0;

        for (int i = 0; i < 3; i++) {
            nilaiUser[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai ke-" + (i + 1) + ": "));
        }

        for (int num : nilaiUser) {
            result += num;
        }
        result /= nilaiUser.length;

        if (result >= 60) {
            JOptionPane.showMessageDialog(null, "RATA-RATAMU: " + result + " 😉");
            JOptionPane.showMessageDialog(null, "ENGGAK USAH SOMBONGGGG!!!!〴⋋_⋌〵");

        } else {
            JOptionPane.showMessageDialog(null, "RATA-RATA KAMU: " + result + " 😥");
            JOptionPane.showMessageDialog(null, "BELAJAR YANG BENEEER MAKANYAA!!!!〴⋋_⋌〵");
        }
    }
}
