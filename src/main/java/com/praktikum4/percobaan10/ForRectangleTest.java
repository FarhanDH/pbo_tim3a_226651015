package com.praktikum4.percobaan10;

class ForRectangle {
    public int height = 3;
    public int width = 10;

    public void displayRectangle() {
        for (int rowCount = 0; rowCount < height; rowCount++) {
            for (int colCount = 0; colCount < width; colCount++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}

public class ForRectangleTest {
    public static void main(String args[]) {
        ForRectangle rect = new ForRectangle();
        rect.displayRectangle();
    }
}
