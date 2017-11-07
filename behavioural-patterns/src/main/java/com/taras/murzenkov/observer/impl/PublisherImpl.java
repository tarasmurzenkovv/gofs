package com.taras.murzenkov.observer.impl;

import com.taras.murzenkov.observer.Publisher;
import com.taras.murzenkov.observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements Publisher<SubscriberImpl> {
    private List<SubscriberImpl> subscribers = new ArrayList<>();

    @Override
    public void register(SubscriberImpl subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void remove(SubscriberImpl subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        this.subscribers.forEach(Subscriber::call);
    }
}
