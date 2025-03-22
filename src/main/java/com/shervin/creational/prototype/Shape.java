package com.shervin.creational.prototype;

//prototype interface
public interface Shape extends Cloneable {

    void draw();

    Shape clone();
}
