package pattern.decorator.position;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 17:06
 **/
public class PostSub extends Post {

    protected PostSub(Position position) {
        super(position);
    }

    @Override
    public void getPosition() {
        super.getPosition();
        System.out.println("PostSub.getPosition" + getValue());
    }

    public String getValue(){
        return "支书";
    }
}
