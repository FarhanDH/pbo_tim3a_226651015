package com.praktikum4.soal_praktikum.test_SRP.CostAlatBerat;

import javax.swing.JOptionPane;

public class Display {

    /**
     * Display the bill with the formatted currency using a JOptionPane dialog box.
     *
     * @param None
     * @return None
     */
    public static void displayBill() {
        JOptionPane.showMessageDialog(null, CurrencyFormatter.billCurrency());
    }

    /**
     * Displays the details of the order using a JOptionPane dialog box.
     *
     * @param None
     * @return None
     */
    public static void displayDetailsOrder() {
        JOptionPane.showMessageDialog(null,
                "Details Order:\n\n" +
                        "Rental Costs: " + CurrencyFormatter.rentalCostsCurrency() +
                        "\n" +
                        "Food Wages: " + CurrencyFormatter.foodWagesCurrency() +
                        "\n" +
                        "Transport Wages: " + CurrencyFormatter.transportWagesCurrency() +
                        "\n" +
                        "Total Days: " + Cost.getTotalDays() +
                        "\n" +
                        "Total Hours: " + Cost.getTotalHours() +
                        "\n\n" +
                        "Total Bill: " + CurrencyFormatter.billCurrency());
    }
}
