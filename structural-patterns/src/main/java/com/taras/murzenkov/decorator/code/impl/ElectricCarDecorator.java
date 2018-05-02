package com.taras.murzenkov.decorator.code.impl;

import com.taras.murzenkov.decorator.code.Car;

/**
 * Basic impl of the {@link CarDecorator}.
 *
 * @author Taras Murzenkov
 */
public class ElectricCarDecorator extends CarDecorator {

    /**
     * Constructor to explicitly use the decorator in the following manner
     * new FirstDecorator(new SecondDecorator(new ThirdDecorator (...)))).assemble().
     *
     * @param car {@link Car}
     */
    public ElectricCarDecorator(final Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Decorating with the electric engine .... ");
    }
}
