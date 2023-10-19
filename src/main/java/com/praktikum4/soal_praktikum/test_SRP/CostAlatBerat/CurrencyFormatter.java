package com.praktikum4.soal_praktikum.test_SRP.CostAlatBerat;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    private static int totalBill = Cost.getTotalBill();
    private static int rentalCosts = Cost.getRentalCosts();
    private static int foodWages = Cost.getFoodWages();
    private static int transportWages = Cost.getTransportWages();

    public static String rentalCostsCurrency() {
        Locale indonesiaLocale = new Locale("id", "ID");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(indonesiaLocale);
        return currencyFormatter.format(rentalCosts);
    }

    public static String foodWagesCurrency() {
        Locale indonesiaLocale = new Locale("id", "ID");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(indonesiaLocale);
        return currencyFormatter.format(foodWages);
    }

    public static String transportWagesCurrency() {
        Locale indonesiaLocale = new Locale("id", "ID");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(indonesiaLocale);
        return currencyFormatter.format(transportWages);
    }

    public static String billCurrency() {
        Locale indonesiaLocale = new Locale("id", "ID");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(indonesiaLocale);
        return currencyFormatter.format(totalBill);
    }
}
