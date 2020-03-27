package pattern.factory;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-28 00:40
 **/
public class CalculationFactoryImpl implements CalculationFactory {

    @Override
    public Calculation newCalculation() {
        return new CalculationImpl();
    }

    @Override
    public User newUser() {
        return new UserImpl();
    }
}
