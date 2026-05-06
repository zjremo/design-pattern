package net.jrz.mediator;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // 1. create UnitedNations
        UnitedNations united = new ConcreteUnitedNations();

        // 2. create countries
        List<Country> countries = new ArrayList<>();
        ConcreteCountry china = new ConcreteCountry("China", united);
        ConcreteCountry america = new ConcreteCountry("America", united);
        ConcreteCountry uk = new ConcreteCountry("UK", united);
        countries.add(china);
        countries.add(america);
        countries.add(uk);
        united.addCountries(countries);

        // 3. 发送消息
        china.sendMessage("America", new Message<>(22));
        china.sendMessage("UK", new Message<>(2.3));
        china.sendMessage("America", new Message<>("hello, I am China!"));
        china.sendMessage("UK", new Message<>(new int[]{1, 2, 3}));
    }
}
