package com.taras.murzenkov.behavior.chain.code;

/**
 * Generic interface that describes the Filter component.
 *
 * @param <T> the type that will be processed by the filter
 * @author Taras_Murzenkov
 */
public interface Filter<T> {

    /**
     * Performs the actual filtering logic on the accepted source.
     *
     * @param source the source that will be filtered
     */
    void doFilter(T source);

    /**
     * Sets the next filter that will be invoked when the {@link Filter#doFilter(Object)} is done with the processing.
     *
     * @param filter the next filter in the chain of the responsibility pattern.
     */
    void next(Filter<T> filter);
}
