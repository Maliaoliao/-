package pattern.visitor;

import org.junit.Test;

/**
 * test.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-22 21:57
 **/
public class Tests {

    @Test
    public void test() {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ElementImpl1(),new ElementImpl2());

        //具体访问者1
        Visitor v = new VisitorImpl1();
        objectStructure.accept(v);
        //具体访问者1
        Visitor v2 = new VisitorImpl2();
        objectStructure.accept(v2);
    }
}
