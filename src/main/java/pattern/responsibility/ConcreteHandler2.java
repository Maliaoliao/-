package pattern.responsibility;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 20:44
 **/
public class ConcreteHandler2 extends Handler{
    @Override
    public void handleReques(String request) {
        System.out.println("ConcreteHandler2.handleReques");
        if(request.equals("B")){
            System.out.println("2 负责处理请求");
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
