package pattern.watch.event;

import org.springframework.context.ApplicationListener;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 21:26
 **/
public class A implements ApplicationListener<wfpEvent> {

    @Override
    public void onApplicationEvent(wfpEvent wfpEvent) {

        if(wfpEvent.name.equals("A")){
            System.out.println("A");
        };
    }
}
