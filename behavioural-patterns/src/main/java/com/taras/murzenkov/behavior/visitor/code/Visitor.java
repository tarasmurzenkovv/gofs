package com.taras.murzenkov.behavior.visitor.code;

/**
 * Visitor pattern implementation.
 * <p>
 * This pattern implements the 'Open/Closed' principle in the essence that the method {@link Visitor#visit(Service)} takes
 * any instance of the {@link Service} and modifies it.
 *
 * @param <T> bounded to the {@link Service}
 * @author Taras_Murzenkov
 */
public interface Visitor<T extends Service> {

    /**
     * Performs the 'visiting' of the provided instance that implements {@link Service}.
     *
     * @param service generic that is bounded to {@link Service}
     */
    void visit(T service);
}
