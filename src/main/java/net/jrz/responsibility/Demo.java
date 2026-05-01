package net.jrz.responsibility;

public class Demo {
    public static void main(String[] args) {
        CommonManager m1 = new CommonManager("经理");
        Majordomo m2 = new Majordomo("总监");
        GeneralManager m3 = new GeneralManager("总经理");

        m1.setSuperior(m2);
        m2.setSuperior(m3);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("jrz请假");
        request.setNumber(1);
        m1.requestApplications(request);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("jrz请假");
        request2.setNumber(4);
        m1.requestApplications(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("jrz加薪");
        request3.setNumber(500);
        m1.requestApplications(request3);

        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("jrz加薪");
        request4.setNumber(1000);
        m1.requestApplications(request4);

    }
}
