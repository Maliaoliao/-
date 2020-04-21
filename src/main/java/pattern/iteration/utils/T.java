package pattern.iteration.utils;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-21 23:16
 **/
public class T {
    public static void main(String[] args) {
        UtilAggre u = new UtilAggreImpl();
        u.add("1","2","3");
        Iteration i = u.getIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(i.one());
    }
}
