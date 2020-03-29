package pattern.adaptee.twowayadaptee;

import org.junit.Test;

/**
 * 双向适配.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-29 22:32
 **/
public class TwoWayTest {
    @Test
    public void test() {
        China chinaImpl = new ChinaImpl();
        English english = new Translate(chinaImpl);
        english.getE();

        System.out.println("==============");
        English EnglishImpl = new EnglishImpl();
        China china = new Translate(EnglishImpl);
        china.getC();

    }
}
