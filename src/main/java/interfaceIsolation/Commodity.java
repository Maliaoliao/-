package interfaceIsolation;

import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

/**
 * 商品类,实现其它接口.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-26 14:13
 **/
public class Commodity implements Order, OrderInfo, Payment {

    Logger logger = (Logger) LoggerFactory.getLogger(Commodity.class);
    @Override
    public void createOrder() {

        logger.log(Level.INFO, "1");
    }

    @Override
    public void cancelOrder() {
        logger.log(Level.INFO, "1");
    }

    @Override
    public void deleteOrder() {
        logger.log(Level.INFO, "1");
    }

    @Override
    public void historyOrder() {
        logger.log(Level.INFO, "1");
    }

    @Override
    public void todayOrder() {
        logger.log(Level.INFO, "1");
    }

    @Override
    public void pay(Double money) {
        logger.log(Level.INFO, "1");
    }
}
