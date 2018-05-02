package com.taras.murzenkov.proxy.code;

/**
 * Interface to provide the basic math functions.
 *
 * @author Taras Murzenkov.
 */
public interface Math {

    /**
     * Adds two doubles.
     *
     * @param first  first
     * @param second second
     * @return result
     */
    double add(double first, double second);

    /**
     * Substracts two doubles.
     *
     * @param first  first
     * @param second second
     * @return result
     */
    double sub(double first, double second);

    /**
     * Multiplies two doubles.
     *
     * @param first  first
     * @param second second
     * @return result
     */
    double mul(double first, double second);

    /**
     * Divides two doubles.
     *
     * @param first  first
     * @param second second
     * @return result
     */
    double div(double first, double second);
}
