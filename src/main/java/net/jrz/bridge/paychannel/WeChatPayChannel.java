package net.jrz.bridge.paychannel;

public class WeChatPayChannel implements PayChannel {
    public void pay(String orderNo, double amount) {
        System.out.println("微信支付：" + orderNo + " 金额：" + amount);
    }

    public void refund(String orderNo, double amount) {
        System.out.println("微信退款：" + orderNo);
    }
}
