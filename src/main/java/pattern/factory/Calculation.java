package pattern.factory;

/**
 * 提供产品(计算方法).
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -03-27 22:47
 */
public interface Calculation {


    /**
     * 计算两个数字的差.
     *
     * @param a the a
     * @param b the b
     * @return the double
     */
    public Double difference(Double a, Double b);

    /**
     * 求和.
     *
     * @param a the a
     * @return the double
     */
    public Double summation(Double... a);

}
