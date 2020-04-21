package pattern.watch.demo;
import	java.util.ArrayList;

import java.util.List;

/**
 * 抽象开会
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-20 20:59
 **/
public abstract class Meeting {

    protected List<Behavior> list = new ArrayList<>();

    protected void addBehavior(Behavior... behavior){
        for (Behavior behavior1 : behavior) {
            list.add(behavior1);
        }
    }
    protected void delBehavior(Behavior... behavior){
        for (Behavior behavior1 : behavior) {
            list.remove(behavior1);
        }
    }

    public abstract void startAction();

}
