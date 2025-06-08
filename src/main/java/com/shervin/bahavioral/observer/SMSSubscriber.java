package com.shervin.bahavioral.observer;

public class SMSSubscriber implements Observer {
    @Override
    public void update(String news) {
        System.out.println("SMS subscriber received: " + news);
    }
}
