package pattern.build;

/**
 * 服务员指挥，组合菜品.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -03-28 16:28
 */
public class Waiter {
    private Kitchen kitchen;

    /**
     * Instantiates a new Head cook.
     *
     * @param kitchen the kitchen
     */
    public Waiter(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    /**
     * Menu menu.
     *
     * @return the menu
     */
    public Menu menu() {
        kitchen.cookSteamedBuns();
        kitchen.cookSteamedRice();
        kitchen.cooknoodle();
        return kitchen.getMenus();
    }
}
