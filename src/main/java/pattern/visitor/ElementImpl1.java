package pattern.visitor;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-22 21:45
 **/
public class ElementImpl1 implements Element{
    @Override
    public void accept(Visitor visitor) {

        visitor.res(this);
    }

    @Override
    public String operation() {
        return "具体1";
    }
}
