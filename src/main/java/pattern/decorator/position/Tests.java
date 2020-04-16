package pattern.decorator.position;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 17:15
 **/
public class Tests {
    @Test
    public void test() {

        Position p = new PositionImpl();
        p.getPosition();
        System.out.println("================");
        /*在村长的职位上面，新增支书职位*/
        Post pos = new PostSub(p);
        pos.getPosition();

    }
}
