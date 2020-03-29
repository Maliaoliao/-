package pattern.proxy.dynamicproxy.jdkProxy;

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
        SpringB proxy = new SpringB();
        Huawei res = (Huawei) proxy.getObject(new HuaweiImpl());


        System.out.println(res.getPhone("1"));
    }


}
