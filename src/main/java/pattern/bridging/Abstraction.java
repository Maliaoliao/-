package pattern.bridging;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 13:58
 **/
public abstract class Abstraction {

    protected Implementor implementor;

    protected Implementor2 implementor2;

    protected Abstraction(Implementor implementor){
        this.implementor = implementor;
    }
    protected Abstraction(Implementor2 implementor2){
        this.implementor2 = implementor2;
    }

    public abstract void open();

    public abstract void open2();
}
