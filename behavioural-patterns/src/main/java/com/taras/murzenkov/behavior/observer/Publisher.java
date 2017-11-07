package com.taras.murzenkov.behavior.observer;

/**
 * Simple 'Publisher' interface (in pattern Publisher-Subscriber).
 * <p>
 * This pattern is designed bearing in mind the 'Open/Closed' principle. This design is implemented by coding to interface
 * with generic types (see the signature of the method {@link Publisher#remove(Subscriber)} or {@link Publisher#register(Subscriber)}
 * and is implemented by providing capabilities to organize (add/remove) any instances of the {@link Subscriber}.
 *
 * @param <T> any instance of the {@link Subscriber}
 * @author Taras Murzenkov
 */
public interface Publisher<T extends Subscriber> {

    /**
     * This method must add the additional subscriber to the {@link Publisher}.
     *
     * @param subscriber any instance of {@link Subscriber}
     */
    void register(T subscriber);

    /**
     * This method must remove the subscriber.
     *
     * @param subscriber any instance of {@link Subscriber}
     */
    void remove(T subscriber);

    /**
     * This method will call the {@link Subscriber#call()}.
     */
    void notifySubscribers();
}
