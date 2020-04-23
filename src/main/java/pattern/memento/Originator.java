package pattern.memento;

/**
 * 创建人.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-23 22:24
 **/
public class Originator {

    private String status;

    private Memento m = new Memento();
    public Memento createMemento() {
        m.setSt(status);
        return m;
    }

    public void restoreMementoStatus(Memento m,int index) {
        this.setStatus(m.getMap().get(index).toString());
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
