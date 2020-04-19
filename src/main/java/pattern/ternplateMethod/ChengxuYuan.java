package pattern.ternplateMethod;

/**
 * 程序员的一天.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-18 20:43
 **/
public class ChengxuYuan extends OneDayWork{
    @Override
    public void work() {
        System.out.println("接水，写代码，修bug......苦逼的一天");
    }

    @Override
    public boolean daKa() {
        return true;
    }

    @Override
    public void goOffWork() {
        System.out.println("不想孤独终老，两个人一起下班的，旁边还又一个妹子");
    }
}
