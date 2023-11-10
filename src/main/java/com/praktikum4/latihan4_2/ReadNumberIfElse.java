package com.praktikum4.latihan4_2;

import javax.swing.JOptionPane;

public class ReadNumberIfElse {
    private static final String[] wordsInIndonesian = {
            "INI SATUU!!!",
            "INI DUAA!!!",
            "INI TIGAA!!!",
            "INI EMPATT!!!",
            "INI LIMAA!!!",
            "INI ENAMM!!!",
            "INI TUJUH!!!",
            "INI DELAPANN!!!",
            "INI SEMBILAN!!!",
            "INI SEPULUH!!!"
    };

    /**
     * Executes the main logic of the program.
     *
     * @param args the command line arguments
     * @return none
     */
    public static void main(String[] args) {
        int input = getInput();

        while (!isValidInput(input)) {
            input = getInput();
        }

        showMessage(wordsInIndonesian[input - 1]);
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
            showMessage("MASUKKIN HARUS BILANGAN BULAATTT YA!!! 〴⋋_⋌〵");
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