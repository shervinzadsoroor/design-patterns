package com.shervin.bahavioral.observer;

public class ObserverTest {

    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Observer email = new EmailSubscriber();
        Observer sms = new SMSSubscriber();
        agency.addObserver(email);
        agency.addObserver(sms);
        agency.setNews("Breaking: Observer pattern Explained in java!");
    }
}
