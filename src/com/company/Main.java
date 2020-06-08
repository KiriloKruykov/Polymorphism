/*
 *
 * Class:Main
 *
 * 08 June 2020
 *
 * Copyright Kryukov Kirilo KNUTE
 *
 * Module 2 task 3
 *
 * Polymorphism
 * Create and implement two interfaces for your class
 *
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        Rhombus rhombus = new Rhombus(
                6,
                8,
                Math.PI * 0.5);

        System.out.println(rhombus + "\n");
        System.out.println(rhombus.toXML() + "\n");
        System.out.println(rhombus.toJSON() + "\n");
        System.out.println(rhombus.toConsole() + "\n");
    }
}
