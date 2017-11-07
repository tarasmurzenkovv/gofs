package com.taras.murzenkov.observer;

public interface Publisher<T extends Subscriber> {
    void register(T subscriber);

    void remove(T subscriber);

    void notifySubscribers();
}
