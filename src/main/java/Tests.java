import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-31 10:37
 **/
public class Tests {

    @Test
    public void test() {
        System.out.println(10 % 3);
        System.out.println(Integer.toBinaryString(1));
        System.out.println(9 ^ 10);
        //List<String> list = new ArrayList<>();
        //map 集合
        /*Map map = new HashMap();
        map.put("key","value");

        System.out.println(map.containsKey("key"));
        System.out.println(map.isEmpty());*/
        int a = 8;

        //System.out.println(Integer.toBinaryString(a));
        int c = 10100;
        int d = 11110;

        try {
            List<String> list = new ArrayList<>();
            list.add("123");
            list.get(2);
        } catch (Error e){
            System.out.println("123123");
        } catch (RuntimeException e){
            System.out.println(e.toString());
        }
        System.out.println(c^d);


        //9 2 4 1
        //4 2 2 0
        //2 2 1 0
        //1

        //10 2 5 0
        //5 2 2 1
        //2 2 1 0
        //1
        //1001
        System.out.println(Integer.toBinaryString(9));
        //1010
        System.out.println(Integer.toBinaryString(10));
        //0001
        System.out.println(9 ^ 10);
        //
        System.out.println(Integer.parseInt("0011", 2));
        //8 2 4 0
        //4 2 2 0
        //2 2 1 0
        //1


        //20 2 10
        //10 2 5 0
        //5 2 2 1
        //2 2 1 0
        //
        //00101
        //10100


    }


}
