package pattern.proxy.staticproxy;

import org.junit.Test;

/**
 * 代理测试.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-28 22:38
 **/
public class ProxyTest {



    @Test
    public void test() {
        ProxyXiaomi proxy = new ProxyXiaomi();
        System.out.println("通过代理商拿到的小米手机" + proxy.getPhone());

    }

    @Test
    public void test1() {
        System.out.println("123123");
    }
}
