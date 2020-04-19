package pattern.strategy;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-18 21:27
 **/
public class Youku implements WatchTv {

    @Override
    public void watch() {
        System.out.println("使用优酷看《清平乐》");
    }
}
