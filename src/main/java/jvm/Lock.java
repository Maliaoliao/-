package jvm;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-18 00:52
 **/
public class Lock {
    public static volatile int i = 0;
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {

            m();
            n();
        }
    }

    public static synchronized void m(){

    }

    public static void n(){
        i = 1;
    }
}
