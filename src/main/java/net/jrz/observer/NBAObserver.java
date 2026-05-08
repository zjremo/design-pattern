package net.jrz.observer;

public class NBAObserver extends Observer{
    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    void update() {
        System.out.printf("%s : %s 请关闭观看NBA，继续工作!\n", sub.getAction(), name);
    }
}
