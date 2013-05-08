package me.guoyao.singleton;

import java.lang.reflect.Constructor;

/**
 * User: guoyao
 * Time: 05-07-2013 17:07
 */
public class SingletonFactory {

    private static Singleton singleton;

    static {
        try {
            Constructor constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
            singleton.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }

}
