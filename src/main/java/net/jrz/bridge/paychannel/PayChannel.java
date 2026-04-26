package net.jrz.bridge.paychannel;

public interface PayChannel {
    void pay(String orderNo, double amount);
    void refund(String orderNo, double amount);
}
