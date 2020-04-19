package pattern.ternplateMethod;

/**
 * 项目经理的一天.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-18 20:46
 **/
public class Xiangmujingli extends OneDayWork{
    @Override
    public void work() {
        System.out.println("开会，撩妹，骂程序员.....开心的一天！");
    }

    @Override
    public boolean daKa() {
        return false;
    }

    @Override
    public void out() {
        System.out.println("虽然打卡失败，但是不想拎包回家，直接去了夜店");
    }

}
