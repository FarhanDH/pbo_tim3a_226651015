package com.praktikum4.soal_praktikum.test_SRP.CostAlatBerat;

import javax.swing.JOptionPane;

public class Display {
    /**
     * Displays the cost by showing a formatted currency message dialog.
     *
     * @param None
     * @return None
     */
    public static void displayBill() {
        JOptionPane.showMessageDialog(null, CurrencyFormatter.billCurrency());
    }

    public static void displayDetailsOrder() {
        JOptionPane.showMessageDialog(null,
                "Details Order:\n\n" +
                        "Rental Costs: " + CurrencyFormatter.rentalCostsCurrency() +
                        "\n" +
                        "Food Wages: " + CurrencyFormatter.foodWagesCurrency() +
                        "\n" +
                        "Transport Wages: " + CurrencyFormatter.transportWagesCurrency() +
                        "\n\n" +
                        "Total Bill: " + CurrencyFormatter.billCurrency());
    }
}
