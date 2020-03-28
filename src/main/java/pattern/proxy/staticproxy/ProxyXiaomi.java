package pattern.proxy.staticproxy;

/**
 * 小米的一个代理商.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-28 22:30
 **/
public class ProxyXiaomi implements Xiaomi {

    private Xiaomi xiaomi;

    public Xiaomi getXiaomi() {
        return xiaomi;
    }

    public void setXiaomi(Xiaomi xiaomi) {
        this.xiaomi = xiaomi;
    }

    @Override
    public String getPhone() {
        if (xiaomi == null) {
            xiaomi = new XiaomiImpl();
        }
        proxyBuffer();
        String phone = xiaomi.getPhone();
        System.out.println(phone);
        proxyAffter();
        return phone;
    }

    private void proxyBuffer() {

        System.out.println("包装。。。。。");
    }

    private void proxyAffter() {
        System.out.println("快递。。。。。");
    }
}
