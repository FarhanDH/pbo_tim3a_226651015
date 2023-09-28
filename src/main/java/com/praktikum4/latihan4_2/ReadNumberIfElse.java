package com.praktikum4.latihan4_2;

import javax.swing.JOptionPane;

public class ReadNumberIfElse {
	public static void main(String[] args) {
		String[] wordsInIndonesian = {
				"INI SATUU!!!",
				"INI DUAA!!!",
				"INI TIGAA!!!",
				"INI EMPATT!!!",
				"INI LIMAA!!!",
				"INI ENAMM!!!",
				"INI TUJUH!!!",
				"INI DELAPANN!!!",
				"INI SEMBILAN!!!",
				"INI SEPULUH!!!"
		};

		int input = Integer.parseInt(JOptionPane.showInputDialog("MASUKKIN ANGKANYAAA!!! 1-10 AJAAA!!!"));

		if (input > 0 && input <= 10) {
			JOptionPane.showMessageDialog(null, wordsInIndonesian[input - 1]);
		} else {
			JOptionPane.showMessageDialog(null, "KAN UDAH DIKASIH TAU 1-10 AJAA!!! 〴⋋_⋌〵");
		}
	}
}
