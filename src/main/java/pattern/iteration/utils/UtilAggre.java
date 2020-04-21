package pattern.iteration.utils;

/**
 * 抽象聚合.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-21 23:04
 **/
public interface UtilAggre {

    void add(Object... o);
    void remove(Object... o);

    Iteration getIterator();

}
