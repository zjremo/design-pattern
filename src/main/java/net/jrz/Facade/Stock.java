package net.jrz.Facade;

public interface Stock {
    void sell();
    void buy();
}

class Stock2 implements Stock{
    @Override
    public void sell() {
        System.out.println("sell Stock2");
    }

    @Override
    public void buy() {
        System.out.println("buy Stock2");
    }
}

class Stock3 implements Stock{
    @Override
    public void sell() {
        System.out.println("sell Stock3");
    }

    @Override
    public void buy() {
        System.out.println("buy Stock3");
    }
}