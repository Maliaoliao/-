package pattern.command;

/**
 * 接受者.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 18:44
 **/
public class Receiver {

    public void action(String key){
        System.out.println("接到指令:"+ key +",开始执行。。。。");
    }
}
