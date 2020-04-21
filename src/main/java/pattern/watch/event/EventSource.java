package pattern.watch.event;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-20 16:36
 **/
public class EventSource {
    private List<WfpListener> list;

    public EventSource() {

        list = new ArrayList<>();
    }

    public void addEvent(WfpListener event) {
        list.add(event);
    }

    public void delEvent(WfpListener event) {
        list.remove(event);
    }

    public void runT() {
        WfpEvent event = new WfpEvent("H");
        not工fies(event);

    }

    protected void not工fies(WfpEvent e) {
        WfpListener ren;
        Iterator<WfpListener> Iterator = list.iterator();
        while (Iterator.hasNext()) {
            ren = Iterator.next();
            ren.listenerEvent(e);
        }
    }
}