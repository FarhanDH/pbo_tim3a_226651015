package com.praktikum3.latihan4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromKeyboadDisplayConsole {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(
                System.in));

        String[] word = new String[3];

        try {
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter word" + (i + 1) + ": ");
                word[i] = dataIn.readLine();
            }
            for (String string : word) {
                System.out.print(string + " ");
            }
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}
