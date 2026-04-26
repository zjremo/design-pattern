package net.jrz.factoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 1. 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        assert shapeFactory != null;

        // 2. 获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // 3. 获取形状为 Rectangle 的对象
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // 4. 获取形状为 Square 的对象
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        assert colorFactory != null;

        Color color1 = colorFactory.getColor("RED");
        color1.fill();
        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();
        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }
}
