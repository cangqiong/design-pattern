package org.pattern.singleton;

/**
 * @author chaon
 * @date 2016/8/22.
 * @description double checked and volatile 单例模式
 */
public class Singleton05 {

    private volatile static Singleton05 instance;

    private Singleton05() {
    }

    public static synchronized Singleton05 getInstance() {
        if (instance == null) {         // Single check
            synchronized (Singleton05.class) {
                if (instance == null) {      // double check
                    instance = new Singleton05();
                }
            }
        }
        return instance;
    }

}
