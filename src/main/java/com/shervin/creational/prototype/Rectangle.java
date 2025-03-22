package com.shervin.creational.prototype;

//concrete prototype
public class Rectangle implements Shape {

    private String color;

    public Rectangle(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("drawing a " + this.color + " rectangle");
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
