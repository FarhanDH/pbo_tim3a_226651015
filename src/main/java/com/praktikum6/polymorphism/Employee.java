package com.praktikum6.polymorphism;

public class Employee {
    private String name;
    private double salary;

    protected Employee(String n, double s) {
        name = n;
    }

    protected String getDetails() {
        return "Name : " + name + "\nSalary : " + salary;
    }

    public void cetak() {
        System.out.println("Coba di Employee");
    }
}