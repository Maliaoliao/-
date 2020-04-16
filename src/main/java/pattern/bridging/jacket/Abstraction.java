package pattern.bridging.jacket;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 14:48
 **/
public abstract class Abstraction {

    protected Brand brand;

    protected Abstraction(Brand brand){
        this.brand = brand;
    }

    public abstract String getRadColor();

    public abstract String getbalkColor();
}
