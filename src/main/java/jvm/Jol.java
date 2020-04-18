package jvm;

import org.openjdk.jol.info.ClassLayout;

/**
 * 内存对象布局.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-17 21:49
 **/
public class Jol {
    private static String name = "";
    public static void main(String[] args) {

        /*User user = new User();
        user.setName("12312");
        user.setEmail(name);

        synchronized (user) {
            System.out.println(ClassLayout.parseInstance(user).toPrintable());
        }
        */
        Object o = new Object();
        System.out.println(o.hashCode());
        System.out.println(ClassLayout.parseInstance(0).toPrintable());
        synchronized (o) {
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
