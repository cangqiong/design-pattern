package org.pattern.singleton;

/**
 * 枚举式单例模式
 *
 * @author chaon
 * @date 2016/8/22.
 */
public enum Singleton08 {
    INSTANCE;

    private Singleton08() {
    }


    public static Singleton08 getInstance() {
        return INSTANCE;
    }

}
