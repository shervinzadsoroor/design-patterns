package com.shervin.bahavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class NewsAgency implements Subject {

    private final Set<Observer> observers = new HashSet<>();
    private String news;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this.news));
    }
}
