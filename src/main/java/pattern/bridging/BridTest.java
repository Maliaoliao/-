package pattern.bridging;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 14:09
 **/
public class BridTest {

    @Test
    public void test(){

        Implementor im = new ConcreteimplementorA();

        Implementor2 implementor2 = new ConcreteimplementorC();


        Abstraction a = new RefinedAbstraction(im);

        Abstraction b = new RefinedAbstraction(implementor2);

        a.open();

        b.open2();
    }
}
