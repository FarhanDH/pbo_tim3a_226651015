package com.praktikum4.soal_praktikum.test_SRP.CostAlatBerat;

import javax.swing.JOptionPane;

public class UserInput {
    /**
     * Retrieves the location from the user.
     *
     * @return the location entered by the user, in lowercase
     */
    public static String getLocation() {
        return JOptionPane.showInputDialog("MASUKKIN LOKASI PAMAKAIAANNN!!!").toLowerCase();
    }

    /**
     * Retrieves the unit type from the user.
     *
     * @return the unit type as a lowercase string
     */
    public static String getUnitType() {
        return JOptionPane.showInputDialog("MASUKKIN JENISS UNITT!!!!").toLowerCase();
    }

    /**
     * Retrieves the number of hours from the user via a JOptionPane input dialog.
     *
     * @return the number of hours entered by the user
     */
    public static int getHours() {
        return Integer.parseInt(JOptionPane.showInputDialog("MASUKKIN JUMLAH JAM PEMAKAAIAAANNNN!!!"));
    }

    /**
     * Returns the total number of days.
     *
     * @return the total number of days
     */
    public static int getTotalDays() {
        return Integer.parseInt(JOptionPane.showInputDialog("MASUKKIN TOTAL HARI PEMAKAAIAAANNNN!!!"));
    }
}
