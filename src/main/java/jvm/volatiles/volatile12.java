package jvm.volatiles;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 乱序执行代码（小心心死机）.
 *
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-21 19:17
 **/
public class volatile12 {

    public static AtomicInteger a = new AtomicInteger();
    public static AtomicInteger b = new AtomicInteger();
    public static AtomicInteger x = new AtomicInteger();
    public static AtomicInteger y = new AtomicInteger();

    @Test
    public void test() throws InterruptedException {
        int i = 0;

        for (; ; ) {
            i++;
            a = new AtomicInteger();
            b = new AtomicInteger();
            x = new AtomicInteger();
            y = new AtomicInteger();
            Thread res1 = new Thread(() -> {
                a.set(1);
                x.set(b.get());
            });
            Thread res2 = new Thread(() -> {
                b.set(1);
                y.set(a.get());
            });
            res1.start();
            res2.start();
            res1.join();
            res2.join();
            if (x.get() == 0 && y.get() == 0) {
                System.out.println(x + "====" + y);
                System.out.println(i);
                break;
            }
        }

    }
}
