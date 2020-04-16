package pattern.appearance;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 18:07
 **/
public class Tour {
    @Test
    public void test(){
        //去北京旅游
        System.out.println("第一天");
        Beijing b = new BeijingDay2();
        b.day1();
        System.out.println("第二天");
        b.day2();
    }
}
