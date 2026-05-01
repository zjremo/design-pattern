package net.jrz.command;

// 模拟用户点单指令
public abstract class Order {
    protected Barbecuer receiver; // 命令接收者
    protected int quantity; // 数量

    public Order(Barbecuer receiver, int quantity) {
        this.receiver = receiver;
        this.quantity = quantity;
    }

    // 执行命令
    public abstract void execute();

    // 撤销命令
    public abstract void undo();

    // 修改数量
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // 获取数量
    public int getQuantity() {
        return quantity;
    }
}

class RoastLambCommand extends Order{
    public RoastLambCommand(Barbecuer receiver, int quantity) {
        super(receiver, quantity);
    }

    @Override
    public void execute() {
        if (quantity > 0){
            System.out.println("订单执行: 烤 " + quantity + " 串羊肉串");
            for (int i = 0; i < quantity; ++i){
                receiver.bakeMutton();
            }
        }
    }

    @Override
    public void undo() {
        System.out.println("订单撤销: 取消 " + quantity + " 串羊肉串");
        this.quantity = 0;
    }
}

class RoastBeefCommand extends Order{
    public RoastBeefCommand(Barbecuer receiver, int quantity) {
        super(receiver, quantity);
    }

    @Override
    public void execute() {
        if (quantity > 0){
            System.out.println("订单执行: 烤 " + quantity + " 份牛肉");
            for (int i = 0; i < quantity; ++i){
                receiver.bakeBeef();
            }
        }
    }

    @Override
    public void undo() {
        System.out.println("订单撤销: 取消 " + quantity + " 份牛肉");
        this.quantity = 0;
    }
}

class RoastChickenWingCommand extends Order{
    public RoastChickenWingCommand(Barbecuer receiver, int quantity) {
        super(receiver, quantity);
    }

    @Override
    public void execute() {
        if (quantity > 0){
            System.out.println("订单执行: 烤 " + quantity + " 个鸡翅");
            for (int i = 0; i < quantity; ++i){
                receiver.bakeChickenWing();
            }
        }
    }

    @Override
    public void undo() {
        System.out.println("订单撤销: 取消 " + quantity + " 个鸡翅");
        this.quantity = 0;
    }
}
