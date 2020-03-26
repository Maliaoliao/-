package principle.interfaceIsolation;

/**
 * 订单信息.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -03-26 14:11
 */
public interface OrderInfo {

    /**
     * 历史订单.
     */
    void historyOrder();

    /**
     *  今日订单.
     */
    void todayOrder();
}
