package com.praktikum4.soal_praktikum.test_SRP.CostAlatBerat;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    private static int totalBill = Cost.getTotalBill();
    private static int rentalCosts = Cost.getRentalCosts();
    private static int foodWages = Cost.getFoodWages();
    private static int transportWages = Cost.getTransportWages();

    /**
     * Returns a string representation of the rental costs in the currency format
     * used in Indonesia.
     *
     * @return a string representation of the rental costs in the currency format
     *         used in Indonesia
     */
    public static String rentalCostsCurrency() {
        Locale indonesiaLocale = new Locale("id", "ID");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(indonesiaLocale);
        return currencyFormatter.format(rentalCosts);
    }

    /**
     * Returns a string representation of the food wages in the currency format
     * used in Indonesia.
     *
     * @return a string representation of the food wages in the currency format
     *         used in Indonesia
     */
    public static String foodWagesCurrency() {
        Locale indonesiaLocale = new Locale("id", "ID");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(indonesiaLocale);
        return currencyFormatter.format(foodWages);
    }

    /**
     * Returns a string representation of the transport wages in the currency format
     * used in Indonesia.
     *
     * @return a string representation of the transport wages in the currency format
     *         used in Indonesia
     */
    public static String transportWagesCurrency() {
        Locale indonesiaLocale = new Locale("id", "ID");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(indonesiaLocale);
        return currencyFormatter.format(transportWages);
    }

    /**
     * Formats the total bill amount into the Indonesian currency format.
     *
     * @return a string representation of the formatted bill amount in Indonesian
     *         currency.
     */
    public static String billCurrency() {
        Locale indonesiaLocale = new Locale("id", "ID");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(indonesiaLocale);
        return currencyFormatter.format(totalBill);
    }
}
