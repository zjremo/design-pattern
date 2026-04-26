package net.jrz.singletonPattern;

// 懒汉式加载 - 双检查锁
public class Singleton2 {
    private static volatile Singleton2 instance;

    public static Singleton2 getInstance() {
        if (instance == null){
            synchronized (Singleton2.class){
                if (instance == null){
                    instance = new Singleton2();
                }
                return instance;
            }
        }

        return instance;
    }
}
