package com.praktikum2.percobaan11;

public class Operator {
    public int a, b;
    boolean c, d, e;
    double f, g;

    public void testOperator() {
        a = 19;
        b = 2;
        c = true;
        d = false;
        e = !c;
        g = 0.2;

        if (a % 2 == 1)
            b = a++;
        else
            b = ++a;

        f = (c && !d || e) ? a / g : a / (g + 1);

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("e : " + e);
        System.out.println("f : " + f);// */
    }

    public static void main(String args[]) {
        Operator oper = new Operator();
        oper.testOperator();
    }

    public int checkMonth(int month, int year) {
        int day = 0;
        if (month < 8) {
            if (month % 2 == 1)
                day = 31;
            else if (month == 2)
                day = (year % 4 == 0) ? 29 : 28;
            else
                day = 30;
        } else {
            if (month % 2 == 1)
                day = 30;
            else
                day = 31;
        }
        return day;
    }

}
