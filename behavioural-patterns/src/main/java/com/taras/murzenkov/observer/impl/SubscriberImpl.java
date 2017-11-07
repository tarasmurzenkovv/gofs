package com.taras.murzenkov.observer.impl;

import com.taras.murzenkov.observer.Subscriber;

public class SubscriberImpl implements Subscriber {

    @Override
    public void call() {
        System.out.println("I have been called");
    }
}
