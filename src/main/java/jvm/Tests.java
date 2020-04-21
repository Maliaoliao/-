package jvm;

import org.openjdk.jol.info.ClassLayout;

/**
 * synchronized.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-21 16:08
 **/
public class Tests {


    public static void main(String[] args) {
        Object o = new Object();
        synchronized(o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }

    }

}
