package com.taras.murzenkov.behavior.strategy.code;

import java.math.BigDecimal;

/**
 * The service to calculate discounts.
 * @author Taras Murzenkov
 */
public interface DiscountProvider {
    /**
     * The concrete implementation of the algorithm to calculate the discount.
     * @param price {@link BigDecimal}
     * @return calucated discount
     */
    BigDecimal calculate(BigDecimal price);
}
