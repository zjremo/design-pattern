package net.jrz.decorators;

// 基础抽象装饰器，仅仅包裹原有的逻辑
public abstract class WearDecorator implements Person{
    protected Person person;

    public WearDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null)
            person.show();
    }
}

// 具体功能增强装饰器 —— 穿T-shirts
class WearTShirts extends WearDecorator{
    public WearTShirts(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("wear T-shirts");
    }
}

// 具体功能增强装饰器 —— 穿BigTrouser
class WearBigTrouser extends WearDecorator{
    public WearBigTrouser(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("wear BigTrouser");
    }
}

// 具体功能增强装饰器 —— 穿suits
class WearSuits extends WearDecorator{
    public WearSuits(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("wear suits");
    }
}