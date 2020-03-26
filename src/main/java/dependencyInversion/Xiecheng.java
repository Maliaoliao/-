package dependencyInversion;

/**
 * @description: 携程旅游
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-26 13:43
 **/
public class Xiecheng implements Travel{
    @Override
    public String go() {
        return "携程旅游网";
    }
}
