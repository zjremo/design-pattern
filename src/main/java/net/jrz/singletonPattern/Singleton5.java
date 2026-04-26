package net.jrz.singletonPattern;

// 懒汉式 —— 内部类
public class Singleton5 {
    private static class LazyHolder{
        static final Singleton5 instance = new Singleton5();
    }

    public static Singleton5 getInstance(){
        return LazyHolder.instance;
    }
}
