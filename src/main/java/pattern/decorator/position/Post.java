package pattern.decorator.position;

/**
 * 抽象装饰职位.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -04-16 17:03
 */
public class Post implements Position{
    /**
     * The Position.
     */
    protected Position position;

    /**
     * Instantiates a new Post.
     *
     * @param position the position
     */
    protected Post(Position position){

        this.position = position;
    }
    @Override
    public void getPosition() {

        position.getPosition();
    }
}
