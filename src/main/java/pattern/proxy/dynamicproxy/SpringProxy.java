package pattern.proxy.dynamicproxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-29 00:28
 **/
public class SpringProxy implements InvocationHandler {
    //真实对象
    private Object obj = null;

    //建造代理对象
    public Object bind(Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("123");
        Object object = method.invoke(obj,args);
        System.out.println("111");
        return object;
    }

}
