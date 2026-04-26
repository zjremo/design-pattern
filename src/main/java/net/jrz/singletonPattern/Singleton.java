package net.jrz.singletonPattern;

// 懒汉式加载 - 方法加锁
public class Singleton {
    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
