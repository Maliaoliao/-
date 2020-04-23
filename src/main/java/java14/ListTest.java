package java14;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-22 17:02
 **/
public class ListTest {

    @Test
    public void test() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        Optional<Integer> res = list.stream().reduce(Integer::sum);
        System.out.println(list.stream().reduce(Integer::compare).get());


    }

    class User {
        private String name;

        private String age;

        private int res;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public int getRes() {
            return res;
        }

        public void setRes(int res) {
            this.res = res;
        }
    }

    @Test
    public void test1() {
        User u = new User();
        u.setName("mall22");

        u.setRes(1);

        u.setAge("20");
        User u1 = new User();
        u1.setName("mall1");

        u1.setRes(1);

        u1.setAge("20");
        User u3 = new User();
        u3.setName("mall2");

        u3.setRes(1);

        u3.setAge("20");

        List<User> list = Arrays.asList(u, u1, u3);

        list.stream().filter(e -> !e.getName().equals("mall1")).forEach(d->{
            System.out.println(d.getName());
        });


    }
}
