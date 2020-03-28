package pattern.build;

import org.junit.Test;

/**
 * 模拟客人到店吃饭的过程.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-28 16:40
 **/
public class Guest {

    @Test
    public void test() {
        //客人点菜
        //厨房中具体是哪位厨师来生产
        //Kitchen kitchen = new SpecificKitchen(); 高级厨师
        //特级厨师
        Kitchen kitchen = new SpecificKitchen2();
        //服务员通知厨房
        Waiter waiter = new Waiter(kitchen);
        //服务员端出菜品
        Menu menu = waiter.menu();
        //上桌
        menu.show();
    }
}
