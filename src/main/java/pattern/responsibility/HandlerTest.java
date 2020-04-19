package pattern.responsibility;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 20:45
 **/
public class HandlerTest {

    @Test
    public void test(){
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        h1.setHandler(h2);
        h1.handleReques("C");
    }
}
