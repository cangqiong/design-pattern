package org.pattern.singleton;

/**
 * @author chaon
 * @date 2016/8/22.
 * @description 懒汉式单例模式（多线程不安全）
 */
public class Singleton01 {

    private static Singleton01 instance;

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        if (instance == null) {
            instance = new Singleton01();
        }
        return instance;
    }

}
