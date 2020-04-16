package pattern.flyweight;

/**
 * 具体享元对象.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 18:50
 **/
public class ConcreteFlyweight implements Flyweight {

    private String key;

    ConcreteFlyweight(String key){
        this.key = key;
        System.out.println("具体享元对象被创建！");
    }


    @Override
    public void operation(UnsharedConcreteFlyweight t) {

        System.out.println("具体享元对象被调用");
        System.out.println("非享元对象信息" + t.getInfo());
    }
}
