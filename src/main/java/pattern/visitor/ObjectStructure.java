package pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象构建.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-22 21:52
 **/
public class ObjectStructure {
    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor){
        list.forEach(e->{
            e.accept(visitor);
        });
    }

    public void add(Element... element){

        for (Element element1 : element) {
            list.add(element1);
        }
    }
}
