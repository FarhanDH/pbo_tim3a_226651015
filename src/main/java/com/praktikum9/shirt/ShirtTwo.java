package com.praktikum9.shirt;

public class ShirtTwo {

    public int shirtID = 0; // Default ID for the shirt

    public String description = "-description required-"; // default

    // The color codes are R=Red, B=Blue, U=Unset
    public char colorCode = 'U';
    public double price = 0.0; // Default price for all shirts

    public int quantityInStock = 0; // Default quantity for all shirts

    public void setShirtInfo(int ID, String desc, double cost) {
        shirtID = ID;
        description = desc;
        price = cost;
    }

    public void setShirtInfo(int ID, String desc, double cost, char color) {
        shirtID = ID;
        description = desc;
        price = cost;
        colorCode = color;
    }

    public void setShirtInfo(int ID, String desc, double cost, char color,

            int quantity) {

        shirtID = ID;
        description = desc;
        price = cost;
        colorCode = color;
        quantityInStock = quantity;

    }

    // This method displays the values for an item
    public void display() {

        System.out.println("Item ID: " + shirtID);
        System.out.println("Item description: " + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Item price: " + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    } // end of display method

} // end of class