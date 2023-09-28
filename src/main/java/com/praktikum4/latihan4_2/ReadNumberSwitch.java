package com.praktikum4.latihan4_2;

import javax.swing.JOptionPane;

public class ReadNumberSwitch {
    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("MASUKKIN ANGKANYAAA!!! 1-10 AJAAA!!!"));

        switch (input) {
            case 1:
                JOptionPane.showMessageDialog(null, "INI SATU!!!");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "INI DUA!!!");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "INI TIGA!!!");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "INI EMPAT!!!");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "INI LIMA!!!");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "INI ENAM!!!");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "INI TUJUH!!!");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "INI DELAPAN!!!");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "INI SEMBILAN!!!");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "INI SEPULUH!!!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "KAN UDAH DIKASIH TAU 1-10 AJA!!! 〴⋋_⋌〵");
                break;
        }
    }
}
