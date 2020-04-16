package pattern.bridging.jacket;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-16 14:56
 **/
public class TestA {

    @Test
    public void test(){
        Brand naik = new Naik();

        Brand adidas = new Adidas();
        Abstraction a = new AcstractionColor(naik);
        Abstraction b = new AcstractionColor(adidas);

        System.out.println(a.getbalkColor());
        System.out.println(a.getRadColor());

        System.out.println(b.getbalkColor());
        System.out.println(b.getRadColor());
    }


}
