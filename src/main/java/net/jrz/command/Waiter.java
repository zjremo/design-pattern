package net.jrz.command;

import java.util.ArrayList;
import java.util.List;

// 服务员类
public class Waiter {
    private List<Order> orders = new ArrayList<>();

    // 点单
    public void addOrder(Order order){
        orders.add(order);
        System.out.println("收到新订单 -> " + order.getClass().getSimpleName() + " 数量: " + order.getQuantity());
    }

    // 提交所有订单（开始做菜）
    public void notifyExecute(){
        System.out.println("服务员: 通知厨房，开始制作所有订单! ");
        for (Order order : orders){
            order.execute();
        }

        System.out.println("-----------------------\n");
    }

    // 撤销最后一个订单
    public void undoLastOrder(){
        if (!orders.isEmpty()) {
            Order lastOrder = orders.getLast();
            lastOrder.undo();
            orders.removeLast();
            System.out.println("服务员: 已经撤销最后一项订单");
        } else {
            System.out.println("服务员: 当前没有订单可以撤销");
        }
    }

    // 修改指定位置的订单数量(模拟用户改需求)
    public void modifyQuantity(int idx, int newQuantity){
        if (idx >= 0 && idx < orders.size()){
            Order order = orders.get(idx);
            order.setQuantity(newQuantity);
            System.out.println("服务员: 修改订单" + idx + "数量为" + newQuantity);
        }
    }
}
