package org.pattern.singleton;

/**
 * 饿汉式单例模式
 *
 * @author chaon
 * @date 2016/8/22.
 */
public class Singleton02 {

    private final static Singleton02 INSTANCE = new Singleton02();

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        return INSTANCE;
    }

}
