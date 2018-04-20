package com.taras.murzenkov.behavior.command.code.impl;

import com.taras.murzenkov.behavior.command.code.Order;

/**
 * The concrete request that comes to the {@link Order}.
 *
 * @author Taras Murzenkov
 */
public class Stock {
    /**
     * Sells stock.
     */
    public void sell() {
        System.out.println("The stock has been soled");
    }

    /**
     * Buys stock.
     */
    public void buy() {
        System.out.println("The stock has been bought");
    }
}
