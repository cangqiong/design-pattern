package org.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题杂志
 */
public class SubjectMagazine implements Subject {
    List<Observer> observerList = new ArrayList<>();

    private String name;
    private double cost;
    private String content;
    private boolean isChanged = false;

    public SubjectMagazine(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public void registerObserver(Observer o) {
        if (!observerList.contains(o)) {
            observerList.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if (observerList.contains(o)) {
            observerList.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        if (isChanged) {
            for (Observer o : observerList) {
                o.update(this);
            }
        }
        isChanged = false;
    }

    public void setContent(String content) {
        if (this.content == null || !this.content.equals("content")) {
            isChanged = true;
        }
        this.content = content;
        notifyObservers();
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getContent() {
        return content;
    }

    public boolean isChanged() {
        return isChanged;
    }

    public void setChanged(boolean changed) {
        isChanged = changed;
    }
}
