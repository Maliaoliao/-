package throwable.error;

import org.junit.Test;

/**
 * .
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-31 13:30
 **/
public class ErrorTest {

    @Test
    public static void test(int i) {
        //Error 测试
        if (i == 0) {
            return;
        } else {
            test(i++);
        }
    }

}
class ErrorEg {
    public static void main(String[] args) {
        // 执行StackOverflow方法
        ErrorTest.test(5);
    }
}
