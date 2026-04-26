package net.jrz.bridge.payment;

import net.jrz.bridge.paychannel.PayChannel;

public class InstallmentPayment extends Payment {
    private int months;

    public InstallmentPayment(PayChannel payChannel, int months) {
        super(payChannel);
        this.months = months;
    }

    @Override
    public void submit(String orderNo, double amount) {
        double firstPay = amount / months;

        System.out.println("订单：" + orderNo);
        System.out.println("分期数：" + months);
        System.out.println("首期支付：" + firstPay);

        channel.pay(orderNo, firstPay);
    }
}
