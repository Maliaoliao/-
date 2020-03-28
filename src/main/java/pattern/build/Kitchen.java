package pattern.build;

/**
 * 厨房.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -03-28 16:20
 */
public abstract class Kitchen {

    /**
     * The Menus.
     */
    protected Menu menus = new Menu();


    /**
     * Cook steamed buns.
     */
    public abstract void cookSteamedBuns();

    /**
     * Cooknoodle.
     */
    public abstract void cooknoodle();

    /**
     * Cook steamed rice.
     */
    public abstract void cookSteamedRice();

    /**
     * Gets menus.
     *
     * @return the menus
     */
    public Menu getMenus() {
        return menus;
    }
}
