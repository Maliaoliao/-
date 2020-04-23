package pattern.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * 备忘录,记住状态.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-23 22:20
 **/
public class Memento {

    int index = 0;

    private Map<Integer, Object> map;

    /*public Memento(Object o) {
        if(map == null){
            map = new HashMap<>();
        }
        map.put(index++, o);
    }*/

    public Map<Integer, Object> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Object> map) {
        this.map = map;
    }

    public void setSt(Object o){
        if(map == null){
            map = new HashMap<>();
        }
        map.put(index++, o);
    }
}
