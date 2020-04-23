package pattern.visitor;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-22 21:43
 **/
public class VisitorImpl2 implements Visitor {
    @Override
    public void res(ElementImpl2 visitor) {
        System.out.println("访问者2，" + visitor.operation());
    }

    @Override
    public void res(ElementImpl1 visitor) {
        System.out.println("访问者1，" + visitor.operation());
    }
}
