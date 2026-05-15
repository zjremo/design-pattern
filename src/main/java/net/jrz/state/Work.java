package net.jrz.state;

public class Work {
    private State current;
    private boolean finish;
    double hour;

    public Work() {
        finish = false;
        current = new ForenoonState();
    }

    public State getCurrent() {
        return current;
    }

    public boolean taskFinished() {
        return finish;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }

}
