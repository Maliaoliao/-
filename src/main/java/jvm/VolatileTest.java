package jvm;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * volatile关键字，.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-21 17:41
 **/
public class VolatileTest {
    volatile boolean res = true;

    void test() {
        System.out.println("start....");
        int i = 0;
        while (res) {
            i++;
            System.out.println(i);
            System.out.println(res);
        }
        System.out.println(res+ "--------------------------");
        System.out.println("end....");
    }

    @Test
    public void test1() {
        VolatileTest t = new VolatileTest();

        new Thread(t::test, "test").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.res = false;
    }
}
