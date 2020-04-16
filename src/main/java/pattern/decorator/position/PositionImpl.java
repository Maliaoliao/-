package pattern.decorator.position;

/**
 * 具体职位.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 17:01
 **/
public class PositionImpl implements Position{

    @Override
    public void getPosition() {
        System.out.println("PositionImpl.getPosition" + "村长");
    }
}
