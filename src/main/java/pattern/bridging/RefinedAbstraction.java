package pattern.bridging;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 14:03
 **/
public class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    protected RefinedAbstraction(Implementor2 implementor2) {
        super(implementor2);
    }
    @Override
    public void open() {
        System.out.println("open");
        implementor.res();
    }

    @Override
    public void open2() {
        implementor2.addAll();
    }
}
