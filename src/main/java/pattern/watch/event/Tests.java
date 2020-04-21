package pattern.watch.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

/**
 * 必须在spring容器中使用.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 21:32
 **/
public class Tests {

    @Autowired
    private static ApplicationEventPublisher applicationContext;

    public static void main(String[] args) {


        /*wfpEvent w = new wfpEvent("A");
        applicationContext.publishEvent(w);*/

        
    }


}