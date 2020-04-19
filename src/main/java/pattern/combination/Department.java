package pattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 部门.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-18 15:26
 **/
public class Department implements Company{

    private String name;

    private List<Company> children = new ArrayList<>();

    public Department(String name){
        this.name = name;
    }

    @Override
    public void add(Company... c) {
        for (Company company : c) {
            children.add(company);
        }
    }

    @Override
    public void remove(Company... c) {
        for (Company company : c) {
            children.remove(company);
        }
    }

    @Override
    public Company getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        System.out.println(name + "部门下的" );
        children.forEach(e->{
            e.operation();
        });
    }

    @Override
    public void opName() {
        System.out.println(children.size());
    }

}
