package me.guoyao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * User: guoyao
 * Time: 05-08-2013 17:17
 */
public class GamePlayerProxy implements InvocationHandler {

    Object target;

    public GamePlayerProxy(Object obj) {
        this.target = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equalsIgnoreCase("login")) {
            System.out.println("Somebody is using my account to login.");
        }
        return method.invoke(this.target, args);
    }
}
