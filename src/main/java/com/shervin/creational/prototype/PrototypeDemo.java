package com.shervin.creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        //create prototype instances
        Shape redCircle = new Circle("red");
        Shape blueRectangle = new Rectangle("blue");

        // Clone the prototypes to create new objects
        Shape greenCircle = redCircle.clone();
        ((Circle) greenCircle).setColor("green"); // Modify the cloned object

        Shape yellowRectangle = blueRectangle.clone();
        ((Rectangle) yellowRectangle).setColor("yellow"); // Modify the cloned object

        // Draw the shapes
        redCircle.draw();
        greenCircle.draw();
        blueRectangle.draw();
        yellowRectangle.draw();
    }
}
