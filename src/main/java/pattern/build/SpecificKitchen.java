package pattern.build;

/**
 * 厨师👩‍🍳.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-28 16:25
 **/
public class SpecificKitchen extends Kitchen {
    @Override
    public void cookSteamedBuns() {
        menus.setSteamedBuns("馒头");
    }

    @Override
    public void cooknoodle() {
        menus.setNoodle("面条");
    }

    @Override
    public void cookSteamedRice() {

        menus.setSteamedRice("米饭");
    }
}
