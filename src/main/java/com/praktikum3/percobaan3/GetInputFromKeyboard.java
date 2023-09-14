package com.praktikum3.percobaan3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "", hoby = "";

        try {
            System.out.print("Nama Anda :");
            name = dataIn.readLine();
            System.out.print("Hobi Anda :");
            hoby = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("gagal membaca keyboard");

        }

        System.out.println("Jadi Anda Hobi " + hoby + ". Hobi yang bagus pak " + name);
    }
}
