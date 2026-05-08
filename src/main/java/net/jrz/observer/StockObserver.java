package net.jrz.observer;

public class StockObserver extends Observer {

    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    public void update(){
        System.out.printf("%s : %s 请关闭股票行情，继续工作!\n", sub.getAction(), name);
    }
}

