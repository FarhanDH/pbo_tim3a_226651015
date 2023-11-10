package com.praktikum2.latihan4_2;

public class Latihan4_2 {
    /**
     * Calculates the average of the numbers in an array.
     *
     * @param -
     * @return void the average of the numbers
     */
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 45, 10 };
        double result = 0;

        for (int i : numbers) {
            result += i;
        }
        result /= numbers.length;
        System.out.println(result);
    }
}
