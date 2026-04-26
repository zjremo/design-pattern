package net.jrz.bridge.payment;

import net.jrz.bridge.paychannel.PayChannel;

public abstract class Payment {
    protected PayChannel channel;

    public Payment(PayChannel channel) {
        this.channel = channel;
    }

    public abstract void submit(String orderNo, double amount);
}
