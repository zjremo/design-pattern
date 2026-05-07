package net.jrz.memento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GameRole {
    private int vit;
    private int atk;
    private int def;

    public GameRole(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public void stateDisplay() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Now the timeStamp is " + localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd:HH:mm:ss")));
        System.out.println("vit :" + vit + ", atk : " + atk + ", def : " + def);
    }

    public RoleStateMemento getMemento() {
        return new RoleStateMemento(vit, atk, def);
    }

    public void fight() {
        this.vit -= 5;
        this.atk -= 5;
        this.def -= 5;
    }

    public void rollback(RoleStateMemento memento) {
        System.out.println("Begin rollback ...");
        this.vit = memento.vit();
        this.atk = memento.atk();
        this.def = memento.def();
        System.out.println("rollback is over...");
    }
}
