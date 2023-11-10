package com.praktikum2.latihan4_3;

public class Latihan4_3 {
    /**
     * This function is the entry point of the Java program. It prints the maximum
     * value
     * from an array of numbers and the maximum value among three integers.
     *
     * @param args the command line arguments
     * @return void
     */
    public static void main(String[] args) {
        int[] numbers = { 10, 23, 5, 43, 3, 100 };
        int max = numbers[0];
        for (int i : numbers) {
            max = i > max ? i : max;
        }
        System.out.println(max);

        int a = 170;
        int b = 220;
        int c = 150;
        int result = (a > b && a > c) ? a : (b > c) ? b : c;
        System.out.println(result);

    }
}
