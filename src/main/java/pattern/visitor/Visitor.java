package pattern.visitor;

/**
 * 抽象访问者.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-22 21:41
 **/
public interface Visitor {
    void res(ElementImpl2 visitor1);
    void res(ElementImpl1 visitor2);
}
