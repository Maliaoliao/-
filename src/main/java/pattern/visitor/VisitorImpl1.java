package pattern.visitor;

/**
 * 具体访问者1.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-22 21:41
 **/
public class VisitorImpl1 implements Visitor{

    @Override
    public void res(ElementImpl2 visitor) {

        System.out.println("访问者2，" + visitor.operation());
    }

    @Override
    public void res(ElementImpl1 visitor) {
        System.out.println("访问者1，" + visitor.operation());

    }
}
