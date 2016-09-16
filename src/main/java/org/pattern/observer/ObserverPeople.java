package org.pattern.observer;

/**
 * 观察者
 */
public class ObserverPeople implements Observer {
    private String name;

    public ObserverPeople(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        readMagine(subject);
    }

    public void readMagine(Subject subject) {
        SubjectMagazine magazine = (SubjectMagazine) subject;
        System.out.println("观察者观察到的内容：" + magazine.getContent());
    }
}
