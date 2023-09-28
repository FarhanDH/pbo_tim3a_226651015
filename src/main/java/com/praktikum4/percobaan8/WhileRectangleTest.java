package com.praktikum4.percobaan8;

class WhileRectangle {
    public int height = 3;
    public int width = 10;

    public void displayRectangle() {
        int colCount = 0;
        int rowCount = 0;
        while (rowCount < height) {
            colCount = 0;
            while (colCount < width) {
                System.out.print("@");
                colCount++;
            }
            System.out.println();
            rowCount++;
        }
    }
}

public class WhileRectangleTest {
    public static void main(String args[]) {
        WhileRectangle rect = new WhileRectangle();
        rect.displayRectangle();
    }
}