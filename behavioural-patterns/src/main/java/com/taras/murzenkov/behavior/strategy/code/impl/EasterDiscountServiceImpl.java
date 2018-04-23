package com.taras.murzenkov.behavior.strategy.code.impl;

import com.taras.murzenkov.behavior.strategy.code.DiscountProvider;

import java.math.BigDecimal;

/**
 * The concrete family of the algorithms to calculate the discount.
 * @author Taras Murzenkov
 */
public class EasterDiscountServiceImpl implements DiscountProvider {

    private static final double DISCOUNT_PERCENTAGE = 0.9;

    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.multiply(BigDecimal.valueOf(DISCOUNT_PERCENTAGE));
    }
}
