package com.taras.murzenkov.decorator.code;

import com.taras.murzenkov.decorator.code.impl.BasicCar;
import com.taras.murzenkov.decorator.code.impl.ElectricCarDecorator;
import com.taras.murzenkov.decorator.code.impl.FormulaDecorator;

/**
 * Client class.
 *
 * @author Taras Murzenkov
 */
public class Client {

    /**
     * Java main class.
     *
     * @param args {@link String}
     */
    public static void main(String[] args) {
        new FormulaDecorator(new ElectricCarDecorator(new BasicCar())).assemble();
    }

}
