package pattern.flyweight;

/**
 * 非享元对象.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 18:46
 **/
public class UnsharedConcreteFlyweight {

    private String info;

    UnsharedConcreteFlyweight(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
