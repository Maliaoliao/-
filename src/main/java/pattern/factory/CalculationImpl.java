package pattern.factory;
import java.util.Arrays;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-27 22:59
 **/
public class CalculationImpl implements Calculation {
    @Override
    public Double difference(Double a, Double b) {
        return null;
    }

    @Override
    public Double summation(Double... a) {
        return Arrays.asList(a).stream().reduce(Double::sum).get();
    }
}
