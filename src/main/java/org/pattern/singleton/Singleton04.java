package org.pattern.singleton;

/**
 * double checked 单例模式（多线程安全）
 *
 * @author chaon
 * @date 2016/8/22.
 */
public class Singleton04 {

    private static Singleton04 instance;

    private Singleton04() {
    }

    public static synchronized Singleton04 getInstance() {
        if (instance == null) {         // Single check
            synchronized (Singleton04.class) {
                if (instance == null) {      // double check
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }

}
