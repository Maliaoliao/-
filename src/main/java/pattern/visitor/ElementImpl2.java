package pattern.visitor;

/**
 * 具体元素2.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-22 21:45
 **/
public class ElementImpl2 implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.res(this);
    }

    @Override
    public String operation() {
        return "具体2";
    }
}
