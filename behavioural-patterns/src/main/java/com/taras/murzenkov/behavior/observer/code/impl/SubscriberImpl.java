package com.taras.murzenkov.behavior.observer.code.impl;

import com.taras.murzenkov.behavior.observer.code.Subscriber;

/**
 * Implementation fo the {@link Subscriber}.
 *
 * @author Taras_Murzenkov
 */
public class SubscriberImpl implements Subscriber {

    @Override
    public void call() {
        System.out.println("I have been called");
    }
}
