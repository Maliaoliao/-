package pattern.strategy;

/**
 * 在家看电视.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-18 21:28
 **/
public class AtHome {
    private WatchTv watchTv;

    public WatchTv getWatchTv() {
        return watchTv;
    }

    public void setWatchTv(WatchTv watchTv) {
        this.watchTv = watchTv;
    }

    public void watch(){
        watchTv.watch();
    }
}
