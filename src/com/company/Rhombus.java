/*
 *
 * Class:Rhombus
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

public class Rhombus implements IGeometry, IPackaging{
    private int biggestSide;
    private int smallerSide;
    private double Angle;

    // Constructors for class Rhombus

    public Rhombus() {
    }

    public Rhombus(int biggestSide, int smallerSide, double Angle) {
        this.biggestSide = biggestSide;
        this.smallerSide = smallerSide;
        this.Angle = Angle;
    }

    // Getters and setters for class Rhombus

    public int getBiggestSide() {
        return biggestSide;
    }

    public void setBiggestSide(int biggestSide) {
        this.biggestSide = biggestSide;
    }

    public int getSmallerSide() {
        return smallerSide;
    }

    public void setSmallerSide(int smallerSide) {
        this.smallerSide = smallerSide;
    }

    public double getAngle() {
        return Angle;
    }

    public void setAngle(double Angle) {
        this.Angle = Angle;
    }

    // Methods for class Rhombus

    // Method getArea() for class Rhombus

    @Override
    public double getArea() {
        return this.getBiggestSide() * this.getSmallerSide()
                * Math.sin(this.getAngle());
    }

    // Method getLinearLength() for class Rhombus

    @Override
    public double getLinearLength() {
        return 2 * (this.getSmallerSide() + this.getBiggestSide());
    }

    // Method toJSON() for class Rhombus

    @Override
    public String toJSON() {
        String json = "Rhombus {"
                + "\""  + "biggestSide\": " + this.getBiggestSide()
                + ", "
                + "\""  + "smallerSide\": " + this.getSmallerSide()
                + ", "
                + "\""  + "angle\": " + this.getAngle()
                + ", "
                + "\""  + "linearLength\": " + this.getLinearLength()
                + ", "
                + "\""  + "area\": " + this.getArea()
                + "}";
        return json;
    }

    // Method toXML() for class Rhombus

    @Override
    public String toXML() {
        String xml = "<Rhombus>"
                + "<biggestSide>" + this.getBiggestSide() + "</biggestSide>"
                + "<smallerSide>" + this.getSmallerSide() + "</smallerSide>"
                + "<angle>" + this.getAngle() + "</angle>"
                + "<linearLength>" + this.getLinearLength() + "</linearLength>"
                + "<area>" + this.getArea() + "</area>"
                +  "</Rhombus>";
        return xml;
    }

    // Method toConsole() for class Rhombus

    @Override
    public String toConsole() {
        return "Rhombus {" + "\n" +
                "Big Side = " + this.getBiggestSide() + "," + "\n" +
                "Small Side = " + this.getSmallerSide() + "," + "\n" +
                "Angle = " + this.getAngle() + "," + "\n" +
                "Linear Length = " + this.getLinearLength() + "," + "\n" +
                "Area = " + this.getArea() +
                '}';
    }

    // Method toString() for class Rhombus

    @Override
    public String toString() {
        return "Rhombus {" +
                "Big Side = " + this.getBiggestSide() +
                ", Small Side = " + this.getSmallerSide() +
                ", Angle = " + this.getAngle() +
                ", Linear Length = " + this.getLinearLength() +
                ", Area = " + this.getArea() +
                '}';
    }


}
