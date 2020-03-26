package principle.dmitry;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-26 15:08
 **/
public class Intermediary {
    //承租
    private LeaseUser leaseUser;
    //出租
    private LesseeUser lease;
    //铁塔
    private TowerUser towerUser;

    public LeaseUser getLeaseUser() {
        return leaseUser;
    }

    public void setLeaseUser(LeaseUser leaseUser) {
        this.leaseUser = leaseUser;
    }

    public LesseeUser getLease() {
        return lease;
    }

    public void setLease(LesseeUser lease) {
        this.lease = lease;
    }

    public TowerUser getTowerUser() {
        return towerUser;
    }

    public void setTowerUser(TowerUser towerUser) {
        this.towerUser = towerUser;
    }

    public void sysOut(){

        String res = "出租：" + getLeaseUser().getName() + "，承租：" + getTowerUser().getName() + "铁塔：" + getLease().getName();
        System.out.println(res);
    }

    public void m(){
        String res = "出租：" + getLeaseUser().getName() + "，承租：" + getTowerUser().getName();
        System.out.println(res);
    }
}
