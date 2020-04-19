package pattern.ternplateMethod;

import org.junit.Test;

/**
 * 开始工作了.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-18 20:48
 **/
public class ActionTime {

    @Test
    public void test() {
        OneDayWork chengxuyuan = new ChengxuYuan();
        chengxuyuan.trmplateMethod();
        OneDayWork Xiangmujingli = new Xiangmujingli();
        Xiangmujingli.trmplateMethod();
    }
}
