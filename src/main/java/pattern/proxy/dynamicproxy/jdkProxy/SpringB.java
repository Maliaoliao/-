package pattern.proxy.dynamicproxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-29 19:55
 **/
public class SpringB implements InvocationHandler {
    private Object obj;
    public Object getObject(Object object) {
        this.obj = object;

        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("之前");
        Object re = method.invoke(obj, args);
        System.out.println("之后");
        return re;
    }
}
