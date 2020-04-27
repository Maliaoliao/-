package jvm.gc;

import org.junit.Test;

import java.io.IOException;
import java.lang.ref.*;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 强软弱虚.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -04-22 15:42
 */
public class Test1 {

    private static final List<Object> list = new LinkedList<>();
    //队列
    private static final ReferenceQueue<M> QUEUE = new ReferenceQueue();
    /**
     * 强引用.
     *
     * @throws IOException the io exception
     */
    @Test
    public void Test2() throws IOException {
        //对象如果被gc 对象则直接会回收
        M m = new M();
        m = null;
        //System.gc();
        System.in.read();
    }

    /**
     * 软引用 多用于缓存.
     *
     * @throws IOException the io exception
     */
    @Test
    public void Test3() throws IOException {
        //设置运行参数 -Xmx20M 如果对象被回收，软引用会判断内存大小，如果内存不足则被回收
        SoftReference<byte[]> softReference = new SoftReference<>(new byte[1024*1024*10]);

        System.out.println(softReference.get());

        System.gc();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(softReference.get());

        byte[] b = new byte[1024*1024*10];
        System.out.println(softReference.get());
    }

    /**
     * 弱引用 一次性 防止内存泄漏.
     *
     * @throws IOException the io exception
     */
    @Test
    public void Test4() throws IOException {
        //～～～～～～ 只要对象被gc 弱引用的对象也会对回收
        WeakReference<M> m = new WeakReference<>(new M());

        System.out.println(m.get());
        //new M() 被回收
        System.gc();
        System.out.println(m.get());

        //ThreadLocal
        ThreadLocal<M> t = new ThreadLocal<>();
        t.set(new M());
        t.remove();

    }

    /**
     * 虚引用 管理堆外内存.防止内存溢出 系统级别的内存
     *
     * @throws IOException the io exception
     */
    @Test
    public void Test6() throws IOException {


        PhantomReference<M> path = new PhantomReference<>(new M(), QUEUE);

        new Thread(()->{
            while (true){
                list.add(new byte[1024*1024]);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(path.get());
            }

        }).start();

        new Thread(()->{
            while (true){
                Reference<? extends M> reference = QUEUE.poll();
                if(reference != null){
                    System.out.println("虚引用被回收！" + reference);
                }
            }

        }).start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 多线程
     *
     * @throws IOException the io exception
     */
    @Test
    public void Test5() throws IOException {
        AtomicReference<String> res = new AtomicReference<>("res");

        new Thread(()->{
            try {
                Thread.sleep(2);
                System.out.println(res.get() + '2');
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();

        new Thread(()->{
            res.set("12312");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(res.get() + '1');
        }).start();



        ThreadLocal<M> t = new ThreadLocal<>();
        t.set(new M());
        t.remove();

    }


}
