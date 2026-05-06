package net.jrz.mediator;

public abstract class Country {
    protected String name;
    abstract <T> void notifyMessage(Message<T> message);
    abstract <T> void sendMessage(String accepter, Message<T> message);
}

class ConcreteCountry extends Country{
    private UnitedNations mediator;

    public ConcreteCountry(String name, UnitedNations mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public <T> void notifyMessage(Message<T> message) {
        System.out.printf("Country{%s}: notify the message{%s} successfully\n", name, message);
    }

    @Override
    public <T> void sendMessage(String acceptor, Message<T> message) {
        mediator.send(name, acceptor, message);
    }
}
