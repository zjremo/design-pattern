package net.jrz.observer;

public abstract class Observer {
    String name;
    Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    abstract void update();
}
