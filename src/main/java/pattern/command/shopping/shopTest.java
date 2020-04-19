package pattern.command.shopping;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 19:31
 **/
public class shopTest {

    @Test
    public void test() {
        Shopping jd = new JDShoppingImpl();
        Shopping tm = new JDShoppingImpl();
        Start start = new Start();

        start.setJdShop(jd);

        start.setTmShop(tm);

        start.tmShopIng();

        start.jdShopIng();

    }
}
