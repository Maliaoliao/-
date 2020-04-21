package pattern.watch.event;

import java.util.EventObject;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 21:24
 **/
public class WfpEvent extends EventObject {
    public String name;

    public WfpEvent(Object source) {
        super(source);
    }

    public WfpEvent(Object source, String name) {
        super(source);
        this.name = name;
    }
}
