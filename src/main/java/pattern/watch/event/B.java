package pattern.watch.event;

import org.springframework.context.ApplicationListener;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 21:26
 **/
public class B implements ApplicationListener<wfpEvent> {

    @Override
    public void onApplicationEvent(wfpEvent wfpEvent) {
        if("B".equals(wfpEvent.name)){
            System.out.println("B");
        };
    }
}
