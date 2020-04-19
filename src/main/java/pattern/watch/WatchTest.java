package pattern.watch;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 21:15
 **/
public class WatchTest {
    @Test
    public void test(){
        Observer o = new ConcreteObserver1();

        Observer o2 = new ConcreteObserver2();

        Subject su = new ConcreteSubject();
        su.add(o);

        su.add(o2);
        su.notifyObserver();
    }
}
