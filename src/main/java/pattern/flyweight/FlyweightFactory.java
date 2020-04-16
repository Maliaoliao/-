package pattern.flyweight;

import java.util.HashMap;

/**
 * 享元工厂.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 18:54
 **/
public class FlyweightFactory {

    private HashMap<String, Flyweight> map = new HashMap();

    public Flyweight getFlyweight(String key){
        Flyweight res = map.get(key);
        if(res != null){
            System.out.println("具体享元对象" + key + "成功获取！");
        }else {
            //put具体享元对象
            res = new ConcreteFlyweight(key);
            map.put(key,res);
        }
        return res;
    }
}
