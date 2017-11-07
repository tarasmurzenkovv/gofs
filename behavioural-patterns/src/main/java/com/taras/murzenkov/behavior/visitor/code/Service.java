package com.taras.murzenkov.behavior.visitor.code;

/**
 * Service interface that provides the API to accept any instance of the {@link Visitor} and do some business logic.
 *
 * @param <T> any instance of the {@link Visitor}.
 * @author Taras Murzenkov
 */
public interface Service<T extends Visitor> {

    /**
     * Provides the callback method to invoke the method of {@link Visitor#visit(Service)}.
     *
     * @param visitor any instance of the {@link Visitor}
     */
    void accept(T visitor);

    /**
     * Stubbed method to fake the business logic.
     */
    void doLogic();
}
