package pattern.ternplateMethod;

/**
 * 一个人上下班的一天.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-18 20:37
 **/
public abstract class OneDayWork {

    public void trmplateMethod() {
        goOnWork();
        //如果打卡成功，开可以上班，否则就直接回家
        if(daKa()){
            //抽象工作内容
            work();
        } else {
            out();
            return;
        }
        goOffWork();

    }

    public void goOnWork(){
        System.out.println("一个人上班");
    }

    public void goOffWork(){
        System.out.println("一个人下班");
    }

    public abstract void work();

    //打卡(钩子)
    public boolean daKa(){
        return true;
    }
    //打卡(钩子)
    public void out(){
        System.out.println("迟到了，直接拎包回家");
    }
}
