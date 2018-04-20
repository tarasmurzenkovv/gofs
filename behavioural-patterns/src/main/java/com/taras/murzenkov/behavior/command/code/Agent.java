package com.taras.murzenkov.behavior.command.code;

import com.taras.murzenkov.behavior.command.code.impl.Stock;

/**
 * Coordinates the requests ({@link Stock}) and concrete implementations of the commands {@link Order}.
 * @author Taras Murzenkov
 */
public interface Agent {
    /**
     * Does placing the order.
     * @param order {@link Order}
     */
    void placeOrder(Order order);
}
