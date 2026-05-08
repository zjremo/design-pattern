package net.jrz.observer;

public interface Subject {
    void attach(Observer... observers);
    void notifyObservers();

    void setAction(String action);
    String getAction();
}
