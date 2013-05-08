package me.guoyao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * User: guoyao
 * Time: 05-08-2013 17:58
 */
public class DynamicProxy<T> {

    @SuppressWarnings("unchecked")
    public static <T> T newInstanceProxy(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler) {
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
