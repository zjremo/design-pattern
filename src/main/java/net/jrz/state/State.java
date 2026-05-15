package net.jrz.state;

public abstract class State {
    abstract void writeProgram(Work work);
}

class ForenoonState extends State{
    @Override
    void writeProgram(Work w) {
        if (w.hour < 12){
            System.out.printf("当前时间: %.2f h 上午工作 精神百倍\n", w.hour);
        } else {
            w.setCurrent(new NoonState());
            w.writeProgram();
        }
    }
}

class NoonState extends State{
    @Override
    void writeProgram(Work w) {
        if (w.hour < 13){
            System.out.printf("当前时间: %.2f h 中午休息\n", w.hour);
        } else {
            w.setCurrent(new AfternoonState());
            w.writeProgram();
        }
    }
}

class AfternoonState extends State{
    @Override
    void writeProgram(Work w) {
        if (w.hour < 17){
            System.out.printf("当前时间: %.2f h 下午继续努力\n", w.hour);
        } else {
            w.setCurrent(new EveningState());
            w.writeProgram();
        }
    }
}

class EveningState extends State{
    @Override
    void writeProgram(Work w) {
        if (w.taskFinished()){
            System.out.println("工作完成, 歇息吧");
        } else {
            if (w.hour < 21){
                System.out.printf("当前时间: %.2f h 加班\n", w.hour);
                return ;
            }
            System.out.printf("当前时间: %.2f h 歇息吧\n", w.hour);
        }
    }
}