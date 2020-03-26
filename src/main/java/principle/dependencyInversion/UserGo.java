package principle.dependencyInversion;

/**
 * @description: 用户选择出游方式
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-26 13:45
 **/
public class UserGo {
    public static void main(String[] args) {
        //用户可以选中去携程
        Travel t = new Xiecheng();
        System.out.println(t.go());
        //用户也可以选中去哪里网
        Travel qunaer = new Qunaer();
        System.out.println(qunaer.go());
        //后续如果需要选择去其它网站的话，就可以水平扩展，这就是依赖倒置原则

    }
}
