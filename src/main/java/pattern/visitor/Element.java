package pattern.visitor;

/**
 * 抽象元素.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-22 21:44
 **/
public interface Element {
    void accept(Visitor visitor);
    String operation();
}
