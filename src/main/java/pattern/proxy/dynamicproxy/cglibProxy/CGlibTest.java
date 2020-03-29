package pattern.proxy.dynamicproxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-29 20:53
 **/
public class CGlibTest {

    @Test
    public void test(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserDao.class);
        enhancer.setCallback(new LogInterceptor());
        UserDao user = (UserDao)enhancer.create();

        user.getUserAll("123123");
        System.out.println(user.id = "123");
    }
}
