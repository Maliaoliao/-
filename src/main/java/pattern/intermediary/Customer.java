package pattern.intermediary;

/**
 * 对于中介来说，双方都是客户.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-20 21:39
 **/
public abstract class Customer {

    protected RealEstateAgency realEstateAgency;

    public void setRealEstateAgency(RealEstateAgency realEstateAgency) {
        this.realEstateAgency = realEstateAgency;
    }

    public abstract void send (String ad);

    public abstract void receive(String from , String ad) ;
}
