package com.praktikum5._7_3_method;

public class Person {
    String name;
    int umur;

    Person(String n, int a) {
        name = n;
        umur = a;
    }

    void printPerson() {
        System.out.print("Hallo…Aku " + name);
        System.out.println("Aku " + umur + " tahun");
    }

    public static void main(String args[]) {
        Person p = new Person("Darmin", 100);
        p.printPerson();
        System.out.println("---------------");
        p.printPerson();
        System.out.println("---------------");
    }
}
