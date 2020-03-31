package throwable.exception;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-31 13:41
 **/
public class ExceptionTest {

    @Test
    public void test() throws MallException {


        if(1 == 1){
            throw new MallException("12312");
        }

    }
}
