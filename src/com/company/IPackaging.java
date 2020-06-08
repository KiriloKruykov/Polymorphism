/*
 *
 * Interface: IPackaging
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

public interface IPackaging {
    String toString();
    String toJSON();
    String toXML();
    String toConsole();
}
