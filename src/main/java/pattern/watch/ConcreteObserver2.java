package pattern.watch;

/**
 * 观察者2.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 21:10
 **/
public class ConcreteObserver2 implements Observer{
    @Override
    public void response() {
        System.out.println("观察着2作出反应！");
    }
}
