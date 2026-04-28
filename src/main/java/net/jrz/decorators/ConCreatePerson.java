package net.jrz.decorators;

public class ConCreatePerson implements Person{
    private final String name;

    public ConCreatePerson(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("Person 's name is " + name);
    }
}
