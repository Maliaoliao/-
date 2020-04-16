package StringClass;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-31 12:23
 **/
public class StringTest {
    @Test
    public void test() {
        long builder = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            sb.append(i + "1");
        }

        long endbuilder = System.currentTimeMillis();
        System.out.println((endbuilder - builder));

        long buffer = System.currentTimeMillis();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < 10000000; i++) {
            sf.append(i + "1");
        }
        long endbuffer = System.currentTimeMillis();
        System.out.println((endbuffer - buffer));
    }
    @Test
    public void test1() {
        System.out.println(1 << 4);
    }
}
