package pattern.build;

/**
 * 厨师👩‍🍳.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-28 16:25
 **/
public class SpecificKitchen2 extends Kitchen {
    @Override
    public void cookSteamedBuns() {
        menus.setSteamedBuns("馒头+1");
    }

    @Override
    public void cooknoodle() {
        menus.setNoodle("面条+1");
    }

    @Override
    public void cookSteamedRice() {

        menus.setSteamedRice("米饭+1");
    }
}
