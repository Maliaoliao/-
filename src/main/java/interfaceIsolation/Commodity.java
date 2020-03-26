package interfaceIsolation;

/**
 * 商品类,实现其它接口.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-26 14:13
 **/
public class Commodity implements Order, OrderInfo, Payment {

    @Override
    public void createOrder() {

    }

    @Override
    public void cancelOrder() {

    }

    @Override
    public void deleteOrder() {

    }

    @Override
    public void historyOrder() {

    }

    @Override
    public void todayOrder() {

    }

    @Override
    public void pay(Double money) {

    }
}
