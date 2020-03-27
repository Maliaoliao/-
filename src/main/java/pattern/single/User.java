package pattern.single;

/**
 * 饿汉模式.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -03-27 14:12
 */
public class User implements Cloneable {

    /**
     * 对象在运行程序的时候就被创建出来了
     */
    private static User instance;

    static {
        instance = new User();
    }
    private User(){
        System.out.println("第N次进入");
    }

    /**
     * Get user user.
     *
     * @return the user
     */
    public static final User getUser(){
        System.out.println("进来");
        return instance;
    }

    /**
     * Gets name.
     */
    public void getName() {
        System.out.println("获取用户名称");
    }

}
