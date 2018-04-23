package com.taras.murzenkov.behavior.strategy.code;

import com.taras.murzenkov.behavior.strategy.code.model.TypeOfHoliday;

import java.math.BigDecimal;

/**
 * Exposes the interface to calculate the discount.
 *
 * @author Taras Murzenkov
 */
public interface DiscountCalculationService {
    /**
     * Calculates the discount based on the type of the {@link TypeOfHoliday} and current price {@link BigDecimal}.
     *
     * @param typeOfHoliday current holiday
     * @param price current price
     * @return dicounted price
     */
    BigDecimal calculateDiscount(TypeOfHoliday typeOfHoliday, BigDecimal price);

    /**
     * Allowes to add the new discount program.
     *
     * @param typeOfHoliday {@link TypeOfHoliday}
     * @param discountProvider {@link DiscountProvider}
     */
    void addProgram(TypeOfHoliday typeOfHoliday, DiscountProvider discountProvider);
}
