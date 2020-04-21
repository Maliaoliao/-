package pattern.watch.demo;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-20 21:08
 **/
public class MeetingTest {

    @Test
    public void test() {

        StartMeetion s = new StartMeetion();
        Behavior a = new A();
        Behavior b = new B();

        s.addBehavior(a,b);
        s.startAction();

    }
}
