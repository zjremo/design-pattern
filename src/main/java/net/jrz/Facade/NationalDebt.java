package net.jrz.Facade;

public interface NationalDebt {
    void sell();
    void buy();
}

class NationalDebt2 implements NationalDebt{
    @Override
    public void sell() {
        System.out.println("sell NationalDebt2");
    }

    @Override
    public void buy() {
        System.out.println("buy NationalDebt2");
    }
}
