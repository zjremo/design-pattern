package net.jrz.state;

public class Demo {
    public static void main(String[] args) {
        Work emergencyProjects = new Work();
        emergencyProjects.hour = 9;
        emergencyProjects.writeProgram();
        emergencyProjects.hour = 10;
        emergencyProjects.writeProgram();
        emergencyProjects.hour = 12;
        emergencyProjects.writeProgram();
        emergencyProjects.hour = 13;
        emergencyProjects.writeProgram();
        emergencyProjects.hour = 14;
        emergencyProjects.writeProgram();
        emergencyProjects.hour = 17;

        emergencyProjects.setFinish(true);
        emergencyProjects.hour = 19;
        emergencyProjects.writeProgram();
        emergencyProjects.setFinish(false);
        emergencyProjects.hour = 20;
        emergencyProjects.writeProgram();
        emergencyProjects.hour = 22;
        emergencyProjects.writeProgram();
    }
}
