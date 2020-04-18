package pattern.combination;

/**
 * 公司具体成员.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-18 15:19
 **/
public class Member implements Company {

    private String name;

    private String sx;

    private int age;


    public Member(String name, String sx, int age){
        this.name = name;
        this.age = age;
        this.sx = sx;
    }
    @Override
    public void add(Company... c) {

    }

    @Override
    public void remove(Company... c) {

    }

    @Override
    public Company getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println(name + "统计到了！,性别：" + sx + "，年龄：" + age);
    }

    @Override
    public void opName() {

    }
}
