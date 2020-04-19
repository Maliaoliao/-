package pattern.command.shopping;

/**
 * 京东具体指令.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 19:13
 **/
public class JDShoppingImpl implements Shopping{

    private JD jd;

    public JDShoppingImpl() {
        jd = new JD();
    }

    @Override
    public void purchase(String start) {
        jd.go(start);
    }
}
