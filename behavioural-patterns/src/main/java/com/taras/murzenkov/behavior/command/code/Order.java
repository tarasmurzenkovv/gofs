package com.taras.murzenkov.behavior.command.code;

import com.taras.murzenkov.behavior.command.code.impl.Stock;

/**
 * In terms of the "Command Pattern" this class is abstract command.
 *
 * @param <T> {@link Stock}
 * @author Taras Murzenkov
 */
public interface Order<T extends Stock> {
    /**
     * Executes the provided {@link Stock} request.
     */
    void execute();
}
