package com.taras.murzenkov.behavior.visitor.code;

/**
 * Visitor pattern implementation.
 *
 * This pattern implements the 'Open/Closed' principle is the essence that the method {@link Visitor#visit(Service)} takes
 * any instance of the {@link Service} and modifies it.
 * @param <T>
 */
public interface Visitor<T extends Service> {
    void visit(T service);
}
