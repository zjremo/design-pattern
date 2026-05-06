package net.jrz.mediator;

import java.util.Arrays;

public class Message<T> {
    private T message;

    public Message(T message) {
        this.message = message;
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    @Override
    public String toString() {
        if (message == null)
            return "null";
        // 数组做单独判断
        String msg = "";
        Class<?> clazz = message.getClass();
        if (clazz.isArray()) {
            // 对象数组
            if (message instanceof Object[]) {
                msg = Arrays.toString((Object[]) message);
            }
            // 基本类型数组（逐个分支）
            if (message instanceof int[]) {
                msg = Arrays.toString((int[]) message);
            }
            if (message instanceof long[]) {
                msg = Arrays.toString((long[]) message);
            }
            if (message instanceof double[]) {
                msg = Arrays.toString((double[]) message);
            }
            if (message instanceof float[]) {
                msg = Arrays.toString((float[]) message);
            }
            if (message instanceof char[]) {
                msg = Arrays.toString((char[]) message);
            }
            if (message instanceof byte[]) {
                msg = Arrays.toString((byte[]) message);
            }
            if (message instanceof short[]) {
                msg = Arrays.toString((short[]) message);
            }
            if (message instanceof boolean[]) {
                msg = Arrays.toString((boolean[]) message);
            }
        } else {
            msg = message.toString();
        }
        return "Message[type : " + message.getClass().getSimpleName() + ", message: " + msg + "]";
    }
}
