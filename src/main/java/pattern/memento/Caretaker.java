package pattern.memento;

/**
 * 管理者.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-23 22:27
 **/
public class Caretaker {
    private Memento message;

    public Memento getMessage() {
        return message;
    }

    public void setMessage(Memento message) {
        this.message = message;
    }
}
