package pattern.proxy.dynamicproxy.cglibProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-29 20:47
 **/
public class LogInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("之前" + method.getName());
        //return null;
        Object res = methodProxy.invokeSuper(o, objects);
        System.out.println("之后" + method.getName());
        return res;
    }


}
