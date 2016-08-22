package org.pattern.singleton;

/**
 * @author chaon
 * @date 2016/8/22.
 * @description 枚举式单例模式
 */
public enum Singleton08 {
    INSTANCE;

    private Singleton08() {
    }


    public static Singleton08 getInstance() {
        return INSTANCE;
    }

}
