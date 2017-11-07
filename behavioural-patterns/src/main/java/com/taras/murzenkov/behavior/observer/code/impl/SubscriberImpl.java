package com.taras.murzenkov.behavior.observer.code.impl;

import com.taras.murzenkov.behavior.observer.code.Subscriber;

public class SubscriberImpl implements Subscriber {
    @Override
    public void call() {
        System.out.println("I have been called");
    }
}
