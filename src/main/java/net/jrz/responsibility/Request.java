package net.jrz.responsibility;

public class Request {
    // 申请类别
    private String requestType;

    // 数量
    private int number;

    // 申请内容
    private String requestContent;

    public String getRequestType() {
        return requestType;
    }

    public int getNumber() {
        return number;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }
}
