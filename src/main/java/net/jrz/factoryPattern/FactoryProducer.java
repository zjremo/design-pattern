package net.jrz.factoryPattern;

// 工厂生成器 -> 工厂(shape or color) -> 拿到各种类型的产品
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory2();
        } else if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
