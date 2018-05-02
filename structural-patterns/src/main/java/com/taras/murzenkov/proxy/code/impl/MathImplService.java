package com.taras.murzenkov.proxy.code.impl;

import com.taras.murzenkov.proxy.code.Math;

/**
 * Impl for the {@link Math}.
 *
 * @author Taras Murzenkov
 */
public class MathImplService implements Math {

    @Override
    public double add(final double first, final double second) {
        return first + second;
    }

    @Override
    public double sub(final double first, final double second) {
        return first - second;
    }

    @Override
    public double mul(final double first, final double second) {
        return first * second;
    }

    @Override
    public double div(final double first, final double second) {
        return first / second;
    }
}
