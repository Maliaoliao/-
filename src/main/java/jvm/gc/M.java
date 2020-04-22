package jvm.gc;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-22 15:42
 **/
public class M {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("M.finalize");
    }
}
