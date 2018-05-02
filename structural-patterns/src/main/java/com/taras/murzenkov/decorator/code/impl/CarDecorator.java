package com.taras.murzenkov.decorator.code.impl;

import com.taras.murzenkov.decorator.code.Car;

/**
 * Basic impl of the {@link BasicCar}.
 *
 * @author Taras Murzenkov
 */
public class CarDecorator extends BasicCar {

    protected final Car car;

    /**
     * Constructor to explicitly use the decorator in the following manner
     * new FirstDecorator(new SecondDecorator(new ThirdDecorator (...)))).assemble().
     *
     * @param car {@link Car}
     */
    public CarDecorator(final Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
