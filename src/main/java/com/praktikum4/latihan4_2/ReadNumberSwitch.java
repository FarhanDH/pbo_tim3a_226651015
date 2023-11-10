package com.praktikum4.latihan4_2;

import javax.swing.JOptionPane;

public class ReadNumberSwitch {
    /**
     * This function represents the main entry point for the Java program.
     *
     * @param args the command line arguments passed to the program
     * @return does not return anything
     */
    public static void main(String[] args) {
        int input = getInput();

        while (!isValidInput(input)) {
            input = getInput();
        }

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

    /**
     * Retrieves user input from a dialog box and converts it to an integer.
     *
     * alse get message if input is not a number
     * 
     * @return the integer value of the user input
     */
    private static int getInput() {
        String input = JOptionPane.showInputDialog("MASUKKIN ANGKANYAAA!!! 1-10 AJAAA!!!");

        try {
            int inputInteger = Integer.parseInt(input);
            if (inputInteger <= 0 || inputInteger > 10) {
                showMessage("KAN UDAH DIKASIH TAU 1-10 AJAA!!! 〴⋋_⋌〵");
                return 0;
            }
            return inputInteger;
        } catch (NumberFormatException e) {
            showMessage("MASUKKIN HARUS BILANGAN BULATTT YA!!! 〴⋋_⋌〵");
            return getInput();
        }
    }

    /**
     * Checks if the input is a valid number between 1 and 10 (inclusive).
     *
     * @param input the input number to be checked
     * @return true if the input is valid, false otherwise
     */
    private static boolean isValidInput(int input) {
        return input > 0 && input <= 10;
    }

    /**
     * Shows a message dialog with the specified message.
     *
     * @param message the message to be displayed in the dialog
     */
    private static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
