package pattern.command;

/**
 * 具体指令.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-19 18:43
 **/
public class CommandImpl implements Command {

    private Receiver receiver;

    CommandImpl(){
        receiver = new Receiver();
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String key) {
        receiver.action(key);
    }
}
