package com.praktikum6.overriding;

public class KelasSuper {
    public void methodAsli() {
        System.out.println("Method milik KelasSuper jalan ");
    }

    public static void main(String[] args) {
        KelasSuper oks = new KelasSuper();
        oks.methodAsli();
    }
}
