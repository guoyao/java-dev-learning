package me.guoyao.proxy;

import java.lang.reflect.Proxy;

/**
 * User: guoyao
 * Time: 05-08-2013 18:07
 */
public class GamePlayerDynamicProxy extends DynamicProxy {

    @SuppressWarnings("unchecked")
    public static <T> T newInstanceProxy(IGamePlayer player) {
        return (T) Proxy.newProxyInstance(player.getClass().getClassLoader(), player.getClass().getInterfaces(), new MyInvocationHandler(player));
    }
}
