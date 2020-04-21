package pattern.watch.event;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 21:26
 **/
public class A implements WfpListener {

    @Override
    public void listenerEvent(WfpEvent wfpEvent) {
        System.out.println("A");
    }
}
