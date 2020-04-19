package pattern.responsibility;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 20:39
 **/
public class ConcreteHandler1 extends Handler{
    @Override
    public void handleReques(String request) {
        System.out.println("ConcreteHandler1.handleReques");
        if(request.equals("A")){
            System.out.println("1 负责处理请求");
        } else{
            Handler nexHadler = getHandler();
            if(nexHadler != null){
                getHandler().handleReques(request);
            } else {
                System.out.println("没有人处理该请求");
            }
        }
    }
}
