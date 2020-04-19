package pattern.command.shopping;

/**
 * 天猫具体指令.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 19:13
 **/
public class TMShoppingImpl implements Shopping{
    private TM tm;
    TMShoppingImpl(){
        tm = new TM();
    }
    
    @Override
    public void purchase(String start) {
        tm.go(start);
    }
}
