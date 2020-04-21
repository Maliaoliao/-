package pattern.intermediary;

/**
 * 抽象出房产中介.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -04-20 21:34
 */
public abstract class RealEstateAgency {

    /**
     * 客户注册.
     */
    public abstract void register(Customer buyer);

    /**
     * 发送消息.
     */
    public abstract void sendMessage(String from, String ad);
}
