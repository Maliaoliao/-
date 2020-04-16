package pattern.decorator;

/**
 * 抽象装饰角色.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 15:56
 **/
public class Decorator implements Component{
    protected Component component;

    public Decorator(Component component){

        this.component = component;
    }
    @Override
    public void opentity() {
        component.opentity();
    }
}
