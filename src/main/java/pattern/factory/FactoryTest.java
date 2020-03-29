package pattern.factory;

import org.junit.Test;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-27 23:22
 **/
public class FactoryTest {

    @Test
    public void test() {
        //妙
        /*Calculation c = new CalculationImpl();
        System.out.println(c.summation(1.1, 1.0));*/

        CalculationFactory calculationFactory = new CalculationFactoryImpl();

        System.out.println(calculationFactory.newCalculation().summation(1.1, 1.0));

        System.out.println(calculationFactory.newUser().getName());
    }
}
