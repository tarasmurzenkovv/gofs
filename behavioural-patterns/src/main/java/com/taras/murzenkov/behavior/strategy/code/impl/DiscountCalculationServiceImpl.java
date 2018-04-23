package com.taras.murzenkov.behavior.strategy.code.impl;

import com.taras.murzenkov.behavior.strategy.code.DiscountCalculationService;
import com.taras.murzenkov.behavior.strategy.code.DiscountProvider;
import com.taras.murzenkov.behavior.strategy.code.model.TypeOfHoliday;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Implementation of the {@link DiscountCalculationService}. This is strategy pattern implementation.
 * @author Taras Murzenkov.
 */
public class DiscountCalculationServiceImpl implements DiscountCalculationService {
    private Map<TypeOfHoliday, DiscountProvider> discountProviderMap = new HashMap<>();

    @Override
    public BigDecimal calculateDiscount(final TypeOfHoliday typeOfHoliday, final BigDecimal price) {
        return Optional.ofNullable(discountProviderMap.get(typeOfHoliday))
                .map(provider -> provider.calculate(price))
                .orElseThrow(() -> new RuntimeException("There is no such discount provider service for the given "
                        + "type of holiday" + typeOfHoliday));
    }

    @Override
    public void addProgram(final TypeOfHoliday typeOfHoliday, final DiscountProvider discountProvider) {
        discountProviderMap.put(typeOfHoliday, discountProvider);
    }
}
