package pattern.adaptee.manyadaptee;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-29 22:06
 **/
public class AdapteeTest {

    @Test
    public void test() {
        English t = new Translate();
        System.out.println(t.getHello());
    }
}
