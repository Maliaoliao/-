package pattern.command;

/**
 * 抽象命令.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -04-19 18:42
 */
public interface Command {

    /**
     * 执行.
     *
     * @param key the key
     */
    void execute(String key);
}
