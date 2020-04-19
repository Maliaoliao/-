package pattern.command;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 18:50
 **/
public class CompanyTest {
    @Test
    public void test() {
        Command command = new CommandImpl();
        Invoker invoker = new Invoker(command);
        invoker.call("action!");
    }
}
