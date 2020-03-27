package pattern.single;

import org.junit.Test;



/**
 * description.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -03-26 21:53
 */
@SuppressWarnings("all")
public class TestRun {

    /**
     * Test 测试懒汉模式.
     */
    @Test
    public void testMethod() {
        Switch s = Switch.getSwitch();
        s.getName();
        Switch s2 = Switch.getSwitch();
        s2.getName();
        //如果使用new出来的对象,对象的code是不一样的。（通过debug的方式可以查看）
        Switch s3 = new Switch();
        if (s == s2) {
            System.out.println("同一个操作对象");
            return;
        }
        System.out.println("不同的操作对象");
    }

    /**
     * Test thread.
     */
    @Test
    public void testThread() {
        //不知道要通过什么方式才能说明懒汉模式是线程非安全的
        Thread t = new Thread(() -> {
            Switch s = Switch.getSwitch();
            s.getName();
            Switch s2 = Switch.getSwitch();
            s2.getName();
            //如果使用new出来的对象,对象的code是不一样的。（通过debug的方式可以查看）
            Switch s3 = new Switch();
            if (s == s2) {
                System.out.println("同一个操作对象");
                return;
            }
            System.out.println("不同的操作对象");
        });
    }

    /**
     * 饿汉模式 Test.
     */
    @Test
    public void test() {
        User u = User.getUser();
        u.getName();

        User u2 = User.getUser();
        u2.getName();


        if(u == u2){
            System.out.println("同一个对象");
        }

    }
}