package pattern.watch;

/**
 * 通知.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 21:14
 **/
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        list.forEach(e->{
            e.response();
        });
    }
}
