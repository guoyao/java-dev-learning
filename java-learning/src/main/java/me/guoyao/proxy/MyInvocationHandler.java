package me.guoyao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * User: guoyao
 * Time: 05-08-2013 17:56
 */
public class MyInvocationHandler implements InvocationHandler {

    Object target;

    public MyInvocationHandler(Object obj) {
        this.target = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }
}
