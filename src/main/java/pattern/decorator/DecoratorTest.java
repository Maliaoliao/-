package pattern.decorator;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 16:02
 **/
public class DecoratorTest {
    @Test
    public void test() {

        Component component = new ComponentImpl();
        //未装饰
        component.opentity();

        Component com = new ConcreteDecorator(component);
        //装饰之后
        com.opentity();
    }
}
