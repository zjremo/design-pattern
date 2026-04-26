package net.jrz.factoryPattern;

/*
* 工厂模式：工厂写死，创建一种产品就需要一个工厂，用户不特别关注创建产品的具体逻辑
* */
public class FactoryMethodExample {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        RectangleFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();

    }
}
