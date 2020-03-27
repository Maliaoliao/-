package pattern.prototype;

/**
 * 原型模式.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -03-27 15:02
 */
public class User {

    public User(){
        System.out.println("创建原型成功");
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }

    public String getName() {
        return "User";
    }

}
