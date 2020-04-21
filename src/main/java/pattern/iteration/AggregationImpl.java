package pattern.iteration;

import java.util.ArrayList;
import java.util.List;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-21 22:24
 **/
public class AggregationImpl implements Aggregation {

    public List<Object> list = new ArrayList<>();

    @Override
    public void add(Object... o) {
        for (Object o1 : o) {
            list.add(o1);
        }
    }

    @Override
    public void remove(Object... o) {
        for (Object o1 : o) {
            list.remove(o1);
        }
    }

    @Override
    public Iteration getIterator() {
        return new IterationImpl(list);
    }
}
