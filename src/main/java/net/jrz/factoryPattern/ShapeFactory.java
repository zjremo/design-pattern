package net.jrz.factoryPattern;

public abstract class ShapeFactory{
    abstract Shape createShape();
}

class CircleFactory extends ShapeFactory{
    @Override
    Shape createShape() {
        return new Circle();
    }
}

class RectangleFactory extends ShapeFactory{
    @Override
    Shape createShape() {
        return new Rectangle();
    }
}
