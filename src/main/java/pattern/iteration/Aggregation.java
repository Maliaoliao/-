package pattern.iteration;

/**
 * 抽象聚合.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-21 22:23
 **/
public interface Aggregation {


    void add(Object... o);

    void remove(Object... o);

    Iteration getIterator();

}
