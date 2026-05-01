package net.jrz.responsibility;

// 经理类
public abstract class Manager {
    protected String name;

    // 上级
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    // 核心方法，用于设置上级，进行责任传递
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    // 申请请求
    abstract public void requestApplications(Request request);
}

// 经理
class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        /*
         * 1. 请假 2天内
         * 2. 请求上级
         * */
        String requestType = request.getRequestType();
        int number = request.getNumber();
        if (requestType.equals("请假") && number <= 2) {
            System.out.format("CommonManager: %s %d天批准\n", requestType, number);
        } else {
            if (superior != null) {
                superior.requestApplications(request);
            }
        }
    }
}

// 总监
class Majordomo extends Manager {
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        /*
         * 1. 请假 5天内
         * 3. 请求上级
         * */
        String requestType = request.getRequestType();
        int number = request.getNumber();
        if (requestType.equals("请假") && number <= 5) {
            System.out.format("Majordomo: %s %d天批准\n", requestType, number);
        } else {
            if (superior != null) {
                superior.requestApplications(request);
            }
        }

    }
}

// 总经理
class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        /*
         * 1. 请假
         * 2. 加薪 500以内
         * 3. 加薪 > 500 以后说
         * */
        String requestType = request.getRequestType();
        int number = request.getNumber();
        if (requestType.equals("请假")) {
            System.out.format("GeneralManager: %s 批准\n", requestType);
        } else if (requestType.equals("加薪") && number <= 500) {
            System.out.format("GeneralManager: %s %d元批准\n", requestType, number);
        } else if (requestType.equals("加薪")){
            System.out.println("GeneralManager: hhh, 以后再说");
        }
    }
}