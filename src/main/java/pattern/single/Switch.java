package pattern.single;

/**
 * 单例模式，模拟打开开关.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-26 21:46
 **/
public class Switch {

    private static volatile Switch witch = null;
    Switch(){
        System.out.println("内部方法");
    }

    public static synchronized Switch getSwitch(){
        //懒汉模式的体现，如果不为空的话会创建，为空的话就会返回已经创建好的对象
        if(witch == null){
            System.out.println("空开关");
            witch = new Switch();
            return witch;
        }
        System.out.println("已经打开了");
        return witch;
    }

    public void getName(){
        System.out.println("这是一个开关");
    };
}
