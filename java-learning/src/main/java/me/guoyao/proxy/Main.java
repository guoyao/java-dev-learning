package me.guoyao.proxy;

import me.guoyao.utils.PrintUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * User: guoyao
 * Time: 05-08-2013 17:20
 */
public class Main {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("Cherry");
        InvocationHandler handler = new GamePlayerProxy(player);
        ClassLoader classLoader = player.getClass().getClassLoader();
        Class<?>[] interfaces = player.getClass().getInterfaces();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, interfaces, handler);
        proxy.login("cherry", "password");
        proxy.killBoss();
        proxy.upgrade();

        PrintUtil.printEmptyLine();

        player = new GamePlayer("Starling");
        proxy = DynamicProxy.newInstanceProxy(classLoader, interfaces, new MyInvocationHandler(player));
        proxy.login("starling", "password");
        proxy.killBoss();
        proxy.upgrade();

        PrintUtil.printEmptyLine();

        player = new GamePlayer("John");
        proxy = GamePlayerDynamicProxy.newInstanceProxy(player);
        proxy.login("john", "password");
        proxy.killBoss();
        proxy.upgrade();
    }
}
