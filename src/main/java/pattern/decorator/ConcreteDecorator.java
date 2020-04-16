package pattern.decorator;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 15:59
 **/
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void opentity() {
        super.opentity();
        add();
    }

    public void add(){
        System.out.println("添加装饰内容");
    }
}
