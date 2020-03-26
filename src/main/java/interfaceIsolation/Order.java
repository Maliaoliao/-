package interfaceIsolation;

/**
 * 用户订单类.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -03-26 14:09
 */
public interface Order {

    /**
     * 用户下订单.
     */
    void createOrder();

    /**
     * 用户取消订单.
     */
    void cancelOrder();

    /**
     * 用户删除订单.
     */
    void deleteOrder();
}
