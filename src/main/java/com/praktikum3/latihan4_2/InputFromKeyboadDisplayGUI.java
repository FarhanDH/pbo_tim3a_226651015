package com.praktikum3.latihan4_2;

import javax.swing.JOptionPane;

public class InputFromKeyboadDisplayGUI {
    /**
     * This function is the entry point for the Java program. It prompts the user to
     * enter three words,
     * stores them in an array, and then displays the words in a dialog box.
     *
     * @param args the command-line arguments for the program (not used in this
     *             function)
     */
    public static void main(String[] args) {
        String[] word = new String[3];
        for (int i = 0; i < word.length; i++) {
            word[i] = JOptionPane.showInputDialog("Enter word" + (i + 1) + ": ");
        }
        JOptionPane.showMessageDialog(null, word[0] + " " + word[1] + " " + word[2]);
    }
}
