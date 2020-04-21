package pattern.iteration.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-21 23:09
 **/
public class UtilAggreImpl implements UtilAggre{

    List<Object> list = new ArrayList<> ();
    @Override
    public void add(Object... o) {
        for (Object o1 : o) {
            list.add(o1);
        }
    }

    @Override
    public void remove(Object... o) {

    }

    @Override
    public Iteration getIterator() {
        return new IterationImpl(list);
    }
}
