package principle.dmitry;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-26 15:24
 **/
public class Test {

    @org.junit.Test
    public void test() {

        Intermediary intermediary = new Intermediary();
        LeaseUser left = new LeaseUser();
        left.setName("中国移动");
        intermediary.setLeaseUser(left);
        LesseeUser lesseeUser = new LesseeUser();
        lesseeUser.setName("我");
        intermediary.setLease(lesseeUser);
        TowerUser towerUser = new TowerUser();
        towerUser.setName("铁塔公司");
        intermediary.setTowerUser(towerUser);
        //三者都有联系
        intermediary.sysOut();
        //只有承租和出租有关系
        intermediary.m();
    }
}
