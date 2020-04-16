package pattern.flyweight;

import org.junit.Test;

/**
 * 测试.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 19:00
 **/
public class FlyweightTest {

    @Test
    public void test() {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("a");
        Flyweight flyweight2 = factory.getFlyweight("a");
        Flyweight flyweight3 = factory.getFlyweight("a");
        Flyweight flyweight4 = factory.getFlyweight("b");
        Flyweight flyweight5 = factory.getFlyweight("b");
        flyweight1.operation(new UnsharedConcreteFlyweight("第1次调用a"));
        flyweight2.operation(new UnsharedConcreteFlyweight("第2次调用a"));
        flyweight3.operation(new UnsharedConcreteFlyweight("第3次调用a"));
        flyweight4.operation(new UnsharedConcreteFlyweight("第1次调用b"));
        flyweight5.operation(new UnsharedConcreteFlyweight("第2次调用b"));
    }
}
