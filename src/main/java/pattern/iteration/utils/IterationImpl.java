package pattern.iteration.utils;

import java.util.List;

/**
 * 具体迭代器.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-21 23:09
 **/
public class IterationImpl implements Iteration {
    int index = 0;
    private List<Object> list;

    public IterationImpl(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object one() {
        return list.size() == 0 ? null : list.get(0);

    }

    @Override
    public Object next() {
        return hasNext() ?  list.get(index++) : null;

    }

    @Override
    public boolean hasNext() {
        return index>= list.size()  ? false : true;
    }
}
