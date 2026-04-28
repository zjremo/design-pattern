package net.jrz.decorators;

public class Demo {
    public static void main(String[] args) {
        Person person = new WearSuits(
                new WearBigTrouser(
                        new WearTShirts(
                                new ConCreatePerson("jrz")
                        )
                )
        );
        person.show();
    }
}
