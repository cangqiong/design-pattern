package org.pattern.singleton;

/**
 * 静态内部类单例模式（多线程安全）
 *
 * @author chaon
 * @date 2016/8/22.
 */
public class Singleton07 {

    private static class SingletonHolder {
        private final static Singleton07 INSTANCE = new Singleton07();
    }

    private Singleton07() {
    }

    public static Singleton07 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
