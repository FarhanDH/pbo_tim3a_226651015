package com.praktikum2.percobaan8;

// Contoh 1
// public class KondisiOperator {
//     public static void main(String[] args) {
//         String status = "";
//         int grade = 80;
//         // mendapatkan status pelajar
//         status = (grade >= 60) ? "Passed" : "Fail";
//         // print status
//         System.out.println(status);
//     }
// }

// Contoh 2
class KondisiOperator {
    public static void main(String[] args) {
        int score = 0;
        char answer = 'a';

        score = (answer == 'a') ? 10 : 0;
        System.out.println("Score = " + score);
    }
}