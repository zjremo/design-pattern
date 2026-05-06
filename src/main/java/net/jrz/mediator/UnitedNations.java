package net.jrz.mediator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class UnitedNations {
    abstract void addCountries(List<Country> list);
    abstract <T> void send(String sender, String accepter, Message<T> message);
}

class ConcreteUnitedNations extends UnitedNations{
    private final Map<String, Country> map;

    public ConcreteUnitedNations(){
        map = new HashMap<>();
    }

    @Override
    public void addCountries(List<Country> list){
        for (Country country : list){
            map.put(country.name, country);
        }
    }

    @Override
    public <T> void send(String sender, String accepter, Message<T> message) {
        if (!map.containsKey(sender)){
            System.out.printf("In %s, the sender{%s} is not exists\n", getClass().getSimpleName(), sender);
            return ;
        }

        if (!map.containsKey(accepter)){
            System.out.printf("In %s, the acceptor{%s} is not exists\n", getClass().getSimpleName(), accepter);
            return ;
        }

        send(map.get(sender), map.get(accepter), message);
    }

    private <T> void send(Country sender, Country accepter, Message<T> message){
        System.out.printf("Country{%s} send message{%s} to Country{%s}\n", sender.name, message, accepter.name);
        accepter.notifyMessage(message);
    }
}