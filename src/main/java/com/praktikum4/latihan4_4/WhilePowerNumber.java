package com.praktikum4.latihan4_4;

import javax.swing.JOptionPane;

public class WhilePowerNumber {
    public static void main(String[] args) {
        int number;
        int power;
        int result = 1;

        // input user
        number = Integer.parseInt(JOptionPane.showInputDialog("MASUKKIN ANGKANYA!!!"));
        power = Integer.parseInt(JOptionPane.showInputDialog("MAU DIPANGKAT BERAPAA!!! "));

        // power of number
        int i = 1;
        while (i <= power) {
            result *= number;
            i++;
        }

        // display
        JOptionPane.showMessageDialog(null, "INI HASILNYAA: " + result + " !!!!!!!!!");
        JOptionPane.showMessageDialog(null, "KALO ENGGAK PERCAYA, KALKULATOOOR SENDIRIII!!!! 〴⋋_⋌〵");
    }
}
