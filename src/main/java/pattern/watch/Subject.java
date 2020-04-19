package pattern.watch;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -04-19 21:11
 */
public abstract class Subject {

    /**
     * The List.
     */
    protected List<Observer> list = new ArrayList<>();

    /**
     * Add.
     *
     * @param observer the observer
     */
    public void add(Observer observer){
         list.add(observer);
     }

    /**
     * Del.
     *
     * @param observer the observer
     */
    public void del(Observer observer){
        list.remove(observer);
    }

    /**
     * 通知观察者.
     */
    public abstract void notifyObserver();
}
