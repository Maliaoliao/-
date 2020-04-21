package pattern.iteration;

import java.util.List;

/**
 * 具体迭代.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-21 22:27
 **/
public class IterationImpl implements Iteration {

    int index = 0;
    public List<Object> list = null;

    IterationImpl(List<Object> list) {

        this.list = list;
    }

    @Override
    public Object one() {
        return list.size() == 0 ? null : list.get(0);
    }

    @Override
    public Object next() {
        return this.haxNext() ? list.get(index++): null;
    }

    @Override
    public boolean haxNext() {

        return index>=list.size() ? false : true;
    }
}
