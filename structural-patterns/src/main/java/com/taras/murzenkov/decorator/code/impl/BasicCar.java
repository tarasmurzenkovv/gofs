package com.taras.murzenkov.decorator.code.impl;

import com.taras.murzenkov.decorator.code.Car;

/**
 * Basic impl of the {@link Car}.
 *
 * @author Taras Murzenkov
 */
public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling basic features ...");
    }
}
