package com.taras.murzenkov.behavior.observer;

/**
 * Provides the api that will be called by the {@link Publisher}.
 *
 * @author Taras Murzenkov
 */
public interface Subscriber {
    /**
     * This method will be called by the {@link Publisher}.
     */
    void call();
}
