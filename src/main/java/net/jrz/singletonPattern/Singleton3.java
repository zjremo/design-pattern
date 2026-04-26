package net.jrz.singletonPattern;

// 饿汉式加载 利用类的初始化
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    public static Singleton3 getInstance() {
        return instance;
    }
}
