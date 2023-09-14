package com.praktikum3.latihan4_2;

import javax.swing.JOptionPane;

public class InputFromKeyboadDisplayGUI {
    public static void main(String[] args) {
        String[] word = new String[3];
        for (int i = 0; i < word.length; i++) {
            word[i] = JOptionPane.showInputDialog("Enter word" + (i + 1) + ": ");
        }
        JOptionPane.showMessageDialog(null, word[0] + " " + word[1] + " " + word[2]);
    }
}
