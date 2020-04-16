package pattern.appearance;

/**
 * 北京两日游.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 18:26
 **/
public class BeijingDay2 implements Beijing {

    Changcheng changcheng = new Changcheng();
    Gugong gugong  = new Gugong();
    Niaocao niao = new Niaocao();

    @Override
    public void day1() {
        changcheng.goChangcheng();
        niao.goNiaocao();

    }

    @Override
    public void day2() {
        gugong.goGugon();
    }
}
