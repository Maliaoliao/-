package pattern.command.shopping;

/**
 * 发送指令.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 19:14
 **/
public class Start {
    private Shopping jdShop,tmShop;

    public Shopping getJdShop() {
        return jdShop;
    }

    public void setJdShop(Shopping sp) {
        jdShop = sp;
    }

    public Shopping getTmShop() {
        return tmShop;
    }

    public void setTmShop(Shopping sp) {
        tmShop = sp;
    }

    public void tmShopIng(){
        jdShop.purchase("tm");
    }

    public void jdShopIng(){
        jdShop.purchase("jd");
    }
}
