package pattern.watch.event;

import org.springframework.context.ApplicationEvent;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 21:24
 **/
public class wfpEvent extends ApplicationEvent {
    public String name;

    public wfpEvent(Object source) {
        super(source);
    }
    public wfpEvent(Object source, String name) {
        super(source);
        this.name = name;
    }
}
