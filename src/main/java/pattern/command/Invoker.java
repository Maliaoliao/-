package pattern.command;

/**
 * 请求者.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -04-19 18:43
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 开始执行.
     */
    public void call(String key) {
        command.execute(key);
    }
}
