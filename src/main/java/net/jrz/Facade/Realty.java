package net.jrz.Facade;

public interface Realty {
    void sell();

    void buy();
}

class Realty2 implements Realty {
    @Override
    public void sell() {
        System.out.println("sell Realty2");
    }

    @Override
    public void buy() {
        System.out.println("buy Reality2");
    }
}
