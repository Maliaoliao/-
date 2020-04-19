package pattern.watch;

/**
 * 观察者1.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 21:09
 **/
public class ConcreteObserver1 implements Observer{
    @Override
    public void response() {
        System.out.println("观察者1作出反应！");
    }
}
