package map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Map 集合允许key为空字符串，如果put的时候key相同，map会调用hascode计算出key的code，如果相同，则覆盖前面一个值.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-01 10:25
 **/
public class hasmap {
    @Test
    public void test() {

        Map map = new HashMap();
        map.put("",1);
        map.put("",2);
        System.out.println(map.get(""));
        map.put("",3);
        System.out.println(map.get(""));
        Map hasTable = new Hashtable();
        hasTable.put("","");
        hasTable.put("","");
        hasTable.put("","");
        System.out.println(hasTable.get("") + "1111");
        //System.out.println(ClassLayout.parseInstance(map).toPrintable());
        /*map.put("a","1");
        map.put("a","1");
        map.forEach((k,v)->{
            System.out.println(k +"==="+ v);
        });*/


        /*String key = "a";
        String keys = "a";
        int h;
        int res = (h = key.hashCode()) ^ (h >>> 16);
        System.out.println(res);
        int s;
        int re = (s = keys.hashCode()) ^ (s >>> 16);
        System.out.println(re);*/




        /*Map maptable = new Hashtable();
        maptable.put("","1");
        maptable.put("","1");
        maptable.put("a","1");
        maptable.put("a","2");
        maptable.forEach((k,v)->{
            System.out.println(k +"==="+ v);
        });
*/
        /*HashSet<String> set = new HashSet<String>();
        set.add("123");
        set.add("123");
        set.add("123");
        set.forEach(e->{
            System.out.println(e);
        });*/
    }
}
