package org.pattern.singleton;

/**
 * @author chaon
 * @date 2016/8/22.
 * @description 饿汉式单例模式
 */
public class Singleton02 {

    private final static Singleton02 INSTANCE = new Singleton02();

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        return INSTANCE;
    }

}
