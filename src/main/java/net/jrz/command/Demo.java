package net.jrz.command;

public class Demo {
    public static void main(String[] args) {
        // 1. 准备工作: 开店，雇佣烤肉师傅和服务员
        Barbecuer chef = new Barbecuer();
        Waiter waiter = new Waiter();

        // 2. 顾客点单
        // action1: 要3串羊肉串
        Order lambOrder = new RoastLambCommand(chef, 3);
        waiter.addOrder(lambOrder);

        // action2: 要2个鸡翅
        Order wingOrder = new RoastChickenWingCommand(chef, 2);
        waiter.addOrder(wingOrder);

        // action2 modify: 3串羊肉串太多，改为1串
        waiter.modifyQuantity(0, 1);

        // action3: 要一份牛肉
        Order beefOrder = new RoastBeefCommand(chef, 1);
        waiter.addOrder(beefOrder);

        // action3 undo: 撤销命令
        waiter.undoLastOrder();

        // 3. 点单结束，全部提交
        waiter.notifyExecute();
    }
}
