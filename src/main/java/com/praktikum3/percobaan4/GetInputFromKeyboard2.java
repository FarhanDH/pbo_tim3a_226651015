package com.praktikum3.percobaan4;

import javax.swing.JOptionPane;

public class GetInputFromKeyboard2 {
    public static void main(String[] args) {
        String name = "", hoby = "";

        name = JOptionPane.showInputDialog("Nama Anda :");
        hoby = JOptionPane.showInputDialog("Hobi Anda :");

        String msg = "Jadi Anda Hobi " + hoby + ". Hobi yang bagus pak " + name;
        JOptionPane.showMessageDialog(null, msg);

        System.out.println("Jadi Anda Hobi " + hoby + ". Hobi yang bagus pak " + name);
    }
}
