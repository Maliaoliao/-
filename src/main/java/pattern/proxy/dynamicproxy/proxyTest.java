package pattern.proxy.dynamicproxy;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-28 23:07
 **/
public class proxyTest {

    @Test
    public void test() {
        SpringProxy proxy = new SpringProxy();
        Huawei res = (Huawei) proxy.bind(new HuaweiImpl());


        System.out.println(res.getPhone("1"));
    }


}
