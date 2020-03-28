package pattern.build;

/**
 * 菜品列表.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-28 16:15
 **/
public class Menu {

    //馒头
    private String steamedBuns;

    //面条
    private String noodle;

    //米饭
    private String steamedRice;

    public void setSteamedBuns(String steamedBuns) {
        this.steamedBuns = steamedBuns;
    }

    public void setNoodle(String noodle) {
        this.noodle = noodle;
    }

    public void setSteamedRice(String steamedRice) {
        this.steamedRice = steamedRice;
    }

    public void show(){
        System.out.println("成品：");
        System.out.println(steamedBuns + "," + noodle + "," + steamedRice);

    }
}
