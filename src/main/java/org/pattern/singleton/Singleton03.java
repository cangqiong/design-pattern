package org.pattern.singleton;

/**
 * @author chaon
 * @date 2016/8/22.
 * @description 懒汉式单例模式（多线程安全）
 */
public class Singleton03 {

    private static Singleton03 instance;

    private Singleton03() {
    }

    public static synchronized Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }

}
