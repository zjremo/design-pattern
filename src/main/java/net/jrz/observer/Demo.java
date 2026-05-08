package net.jrz.observer;

public class Demo {
    public static void main(String[] args) {
        Subject se = new Secretary();

        Observer o1 = new StockObserver("o1", se);
        Observer o2 = new NBAObserver("o2", se);
        se.attach(o1, o2);

        se.setAction("Boss has come back !");
        se.notifyObservers();
    }
}
