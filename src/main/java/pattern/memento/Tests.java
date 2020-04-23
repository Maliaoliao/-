package pattern.memento;

import org.junit.Test;

/**
 * 测试.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-23 22:28
 **/
public class Tests {

    @Test
    public void test(){
        Originator or = new Originator();

        Caretaker ca = new Caretaker();
        or.setStatus("0");
        System.out.println(or.getStatus());
        ca.setMessage(or.createMemento());
        //新状态
        or.setStatus("1");
        System.out.println(or.getStatus());

        or.setStatus("2");
        ca.setMessage(or.createMemento());

        or.setStatus("3");
        ca.setMessage(or.createMemento());

        or.setStatus("4");
        ca.setMessage(or.createMemento());

        or.setStatus("5");
        ca.setMessage(or.createMemento());

        //恢复指定版本。。哈哈哈
        or.restoreMementoStatus(ca.getMessage(),1);
        //恢复为久状态
        System.out.println(or.getStatus());
    }
}
