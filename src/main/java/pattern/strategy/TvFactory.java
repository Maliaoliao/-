package pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * tv工厂.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-18 21:38
 **/
public class TvFactory {

    private Map<String, WatchTv> map = new HashMap<>();

    public WatchTv getWatchTv(String key) {
        WatchTv watchTv = map.get(key);
        if (watchTv == null) {
            switch (key) {
                case "T":
                    watchTv = new TengXun();
                    break;
                case "Y":
                    watchTv = new Youku();
                    break;
                default:
                    throw new RuntimeException("未知策略类型！");
            }
            map.put(key, watchTv);

        }
        return watchTv;
    }


    public void getWatchTvWatch(String key) {
        getWatchTv(key).watch();
    }

}
