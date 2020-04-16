package pattern.decorator;

/**
 * 具体抽象构建.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 15:54
 **/
public class ComponentImpl implements Component {

    public ComponentImpl(){
        System.out.println("构建");
    }
    @Override
    public void opentity() {
        System.out.println("ComponentImpl.opentity");
    }
}
