package pattern.intermediary;

import java.util.ArrayList;
import java.util.List;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-20 21:37
 **/
public class RealEstateAgencyImpl extends RealEstateAgency {

    private List<Customer> list = new ArrayList<>();

    @Override
    public void register(Customer buyer) {
        if(list.contains(buyer)){
            list.add(buyer);
            buyer.setRealEstateAgency(this);
        }
    }

    @Override
    public void sendMessage(String from, String ad) {

    }
}
