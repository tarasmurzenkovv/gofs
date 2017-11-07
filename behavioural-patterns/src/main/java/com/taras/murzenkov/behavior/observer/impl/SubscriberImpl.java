package com.taras.murzenkov.behavior.observer.impl;

import com.taras.murzenkov.behavior.observer.Subscriber;

public class SubscriberImpl implements Subscriber {
    @Override
    public void call() {
        System.out.println("I have been called");
    }
}
