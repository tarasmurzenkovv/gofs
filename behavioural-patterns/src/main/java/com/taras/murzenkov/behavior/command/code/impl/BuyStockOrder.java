package com.taras.murzenkov.behavior.command.code.impl;

import com.taras.murzenkov.behavior.command.code.Order;

/**
 * This class incapsulates the Buy Request order.
 * Here order means the concreate implementation of the {@link Order} command.
 *
 * @author Taras Murzenkov
 */
public class BuyStockOrder implements Order<Stock> {
    private final Stock stock;

    /**
     * Constructs the concrete implementation of the {@link Order} from the provided request {@link Stock}.
     * @param stock {@link Stock}
     */
    public BuyStockOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
