package jvm.volatiles;

import org.junit.Test;

/**
 * 缓存行未对齐.
 * 效率会翻倍
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-21 19:17
 **/
public class volatile1 {
    private static class Padding{
        //缓冲行自动补齐
        public volatile long p1,p2,p3,p4,p5,p6,p7;
    }
    private static class T extends Padding{
        private volatile long x = 0L;
    }

    public static T[] arr= new T[2];

    static {
        arr[0] = new T();
        arr[1] = new T();
    }

    @Test
    public void test() throws InterruptedException {
        Thread res1 = new Thread(() -> {
            System.out.println("1");
            for (int i = 0; i < 1000_0000; i++) {
                arr[0].x = i;
            }
        });

        Thread res2 = new Thread(() -> {

            System.out.println("2");
            for (int i = 0; i < 1000_0000; i++) {
                arr[1].x = i;
            }
        });

        long start = System.nanoTime();
        res1.start();
        res2.start();
        res1.join();
        res2.join();

        long end = System.nanoTime();
        System.out.println((end - start)/100_0000);
    }
}
