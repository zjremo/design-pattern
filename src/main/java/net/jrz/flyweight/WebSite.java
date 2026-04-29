package net.jrz.flyweight;

public abstract class WebSite {
    protected WebActions webAction;

    public abstract void printInfo();

    public void access(User user){
        webAction.access(user);
    }

    public void welcome(){
        webAction.welcome();
    }

    public void exit(User user){
        webAction.exit(user);
    }

    public void introduction(){
        webAction.introduction();
    }
}

class ConcreteWebSite extends WebSite {

    private final String name;

    public ConcreteWebSite(WebActions webAction, String name) {
        this.webAction = webAction;
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println("The website name is " + name + ".");
    }
}