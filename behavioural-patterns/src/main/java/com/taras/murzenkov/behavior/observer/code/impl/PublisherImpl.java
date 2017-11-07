package com.taras.murzenkov.behavior.observer.code.impl;

import com.taras.murzenkov.behavior.observer.code.Publisher;
import com.taras.murzenkov.behavior.observer.code.Subscriber;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of the {@link Publisher}. Uses the instance of {@link Subscriber}.
 *
 * @author Taras Murzenkov
 */
public class PublisherImpl implements Publisher<Subscriber> {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void register(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void remove(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        this.subscribers.forEach(Subscriber::call);
    }
}
