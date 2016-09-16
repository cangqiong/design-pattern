package org.pattern.observer;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        SubjectMagazine fashonMagine = new SubjectMagazine("fashon", 20);
        ObserverPeople zhangsan = new ObserverPeople("zhangsan");
        fashonMagine.registerObserver(zhangsan);
        fashonMagine.setContent("The observer news");
    }
}
