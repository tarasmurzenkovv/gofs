package com.taras.murzenkov.proxy.code.impl;

import com.taras.murzenkov.proxy.code.Math;

/**
 * Proxy for the {@link MathImplService}. Stores the result into DB.
 *
 * @author Taras Murzenkov
 */
public class MathProxyService implements Math {

    private final Math mathServiceToBeProxied = new MathImplService();

    @Override
    public double add(final double first, final double second) {
        final double result = this.mathServiceToBeProxied.add(first, second);
        System.out.println("Stored result into db " + result);
        return result;
    }

    @Override
    public double sub(final double first, final double second) {
        final double result = this.mathServiceToBeProxied.sub(first, second);
        System.out.println("Stored result into db " + result);
        return result;
    }

    @Override
    public double mul(final double first, final double second) {
        final double result = this.mathServiceToBeProxied.mul(first, second);
        System.out.println("Stored result into db " + result);
        return result;
    }

    @Override
    public double div(final double first, final double second) {
        final double result = this.mathServiceToBeProxied.div(first, second);
        System.out.println("Stored result into db " + result);
        return result;
    }
}
