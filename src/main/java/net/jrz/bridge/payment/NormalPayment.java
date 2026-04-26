package net.jrz.bridge.payment;

import net.jrz.bridge.paychannel.PayChannel;

// 普通支付
public class NormalPayment extends Payment{
    public NormalPayment(PayChannel channel) {
        super(channel);
    }

    @Override
    public void submit(String orderNo, double amount) {
        channel.pay(orderNo, amount);
    }
}
