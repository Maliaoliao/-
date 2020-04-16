package java14;

import org.springframework.beans.factory.ObjectFactory;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-05 21:48
 **/
public class TestService {



    public Object getSingleton(String beanName, ObjectFactory<?> singletonFactory) {
        System.out.println(beanName);
        return "123";
    }


    public String getName(String name){
        System.out.println(name + "--------");
        return name;
    }


}
