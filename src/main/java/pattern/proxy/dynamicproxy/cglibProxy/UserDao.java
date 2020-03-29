package pattern.proxy.dynamicproxy.cglibProxy;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-29 20:45
 **/
public class UserDao {

    final String name = "1";

    String id = "2";
    public String getUserAll(String name){
        System.out.println("查询全部用户！");
        return "all";
    }

    public final String getUserName(){
        System.out.println("final");
        return "final";
    }
}
