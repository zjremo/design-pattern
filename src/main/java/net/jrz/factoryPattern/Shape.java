package net.jrz.factoryPattern;

public interface Shape {
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}
