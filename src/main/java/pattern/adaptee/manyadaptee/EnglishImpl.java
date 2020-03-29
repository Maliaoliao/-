package pattern.adaptee.manyadaptee;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-29 22:03
 **/
public class EnglishImpl implements English {
    @Override
    public String getHello() {
        System.out.println("hi");
        return "hi";
    }
}
