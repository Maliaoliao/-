package pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * description.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -03-28 23:03
 */
public class MyProxy implements InvocationHandler {

    //真实对象
    private Object objecrs = null;

    /**
     * Bind object.
     *
     * @param objecrs the objecrs
     * @return the object
     */

    public Object bind(Object objecrs){
        this.objecrs = objecrs;
        return Proxy.newProxyInstance(objecrs.getClass().getClassLoader(), objecrs.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("1");
        //这个objecrs一定要是真实对象中的对象，否则会进入死循环
        Object object = method.invoke(objecrs,args);
        System.out.println("2");
        return object;
    }
}
