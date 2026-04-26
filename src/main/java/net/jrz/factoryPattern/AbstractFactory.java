package net.jrz.factoryPattern;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}

class ShapeFactory2 extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null){
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}

class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null){
            return null;
        }

        if (color.equalsIgnoreCase("RED")){
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
}