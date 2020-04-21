package pattern.watch.event;

import java.util.EventListener;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-20 16:27
 **/
public interface WfpListener extends EventListener {


    public void listenerEvent(WfpEvent wfpEvent);
}
