package pattern.iteration;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-21 22:44
 **/
public class AggregateTest {

    @Test
    public void test(){

        Aggregation a = new AggregationImpl();
        a.add("马","1","2","3");

        Iteration i = a.getIterator();
        while (i.haxNext()) {
            System.out.println(i.next());
        }
        System.out.println(i.one());

    }
}
