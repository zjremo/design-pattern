package net.jrz.bridge.paychannel;

public class AliPayChannel implements PayChannel {
    @Override
    public void pay(String orderNo, double amount) {
        System.out.println("支付宝支付: " + orderNo + " 金额:" + amount);
    }

    @Override
    public void refund(String orderNo, double amount) {
        System.out.println("支付宝退款：" + orderNo);
    }
}
