package net.jrz.bridge;

import net.jrz.bridge.paychannel.AliPayChannel;
import net.jrz.bridge.paychannel.WeChatPayChannel;
import net.jrz.bridge.payment.InstallmentPayment;
import net.jrz.bridge.payment.NormalPayment;
import net.jrz.bridge.payment.Payment;
import net.jrz.bridge.payment.VipPayment;

public class Demo {
    public static void main(String[] args) {
        Payment p1 = new NormalPayment(new AliPayChannel());
        p1.submit("A1001", 1000);

        Payment p2 = new InstallmentPayment(new WeChatPayChannel(), 12);
        p2.submit("A1002", 12000);

        Payment p3 = new VipPayment(new AliPayChannel());
        p3.submit("A1003", 5000);
    }
}
