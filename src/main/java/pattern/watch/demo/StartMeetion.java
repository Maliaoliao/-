package pattern.watch.demo;

/**
 * 通知.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-20 21:07
 **/
public class StartMeetion extends Meeting {
    @Override
    public void startAction() {
        list.forEach(e->{
            e.goAction();
        });
    }
}
