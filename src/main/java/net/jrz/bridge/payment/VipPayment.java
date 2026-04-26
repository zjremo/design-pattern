package net.jrz.bridge.payment;

import net.jrz.bridge.paychannel.PayChannel;

public class VipPayment extends Payment {
    public VipPayment(PayChannel channel) {
        super(channel);
    }

    @Override
    public void submit(String orderNo, double amount) {
        double discount = amount * 0.9;

        System.out.println("VIP用户9折优惠");

        channel.pay(orderNo, discount);
    }
}
