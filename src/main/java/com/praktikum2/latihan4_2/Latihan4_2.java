package com.praktikum2.latihan4_2;

public class Latihan4_2 {
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
