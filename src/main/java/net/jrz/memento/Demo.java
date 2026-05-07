package net.jrz.memento;

public class Demo {
    public static void main(String[] args) {
        // 游戏前
        GameRole role = new GameRole(10, 11, 12);
        role.stateDisplay();

        // 保存进度
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(role.getMemento());

        // 游戏后，状态损耗
        role.fight();
        role.stateDisplay();

        // 恢复
        role.rollback(stateAdmin.getMemento());
        role.stateDisplay();
    }
}
