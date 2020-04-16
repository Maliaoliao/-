package java14;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-05 21:49
 **/
public abstract class Tests extends TestService {

    @Test
    public void set() {
        String name = "123123";
        Object res = getSingleton(name, () -> {

            return getA(name);
        });
        System.out.println(res);
    }

    public abstract String getA(String name);
}
