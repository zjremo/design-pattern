package net.jrz.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Secretary implements Subject {
    // 同事列表
    List<Observer> observers = new ArrayList<>();
    private String action;

    // add
    @Override
    public void attach(Observer... observers){
        this.observers.addAll(Arrays.asList(observers));
    }

    // notify
    @Override
    public void notifyObservers(){
        for (Observer s : observers){
            s.update();
        }
    }

    @Override
    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String getAction() {
        return action;
    }
}
