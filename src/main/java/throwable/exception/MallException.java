package throwable.exception;

/**
 * 自定义异常.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-31 13:38
 **/
public class MallException extends Exception {

    private String exceptionMessage;

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public MallException(){
        super();
    }
    public MallException(String e){

    }
    public MallException(MallException e){
        super();
    }
}
