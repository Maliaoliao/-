package pattern.strategy;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-18 21:33
 **/
public class Watch {

    @Test
    public void test(){
        /*AtHome home = new AtHome();
        WatchTv wacth = new TengXun();
        home.setWatchTv(wacth);
        home.watch();*/
        TvFactory factory = new TvFactory();
        factory.getWatchTvWatch("TT");

        factory.getWatchTvWatch("Y");

    }
}
