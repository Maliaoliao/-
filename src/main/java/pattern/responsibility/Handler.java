package pattern.responsibility;

/**
 * 抽象处理者.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -04-19 20:37
 */
public abstract class Handler {
    private Handler handler;

    /**
     * Gets handler.
     *
     * @return the handler
     */
    public Handler getHandler() {
        return handler;
    }

    /**
     * Sets handler.
     *
     * @param handler the handler
     */
    public void setHandler(Handler handler) {
        this.handler = handler;
    }


    /**
     * 抽象处理方法.
     *
     * @param request the request
     */
    public abstract void handleReques(String request);
}
