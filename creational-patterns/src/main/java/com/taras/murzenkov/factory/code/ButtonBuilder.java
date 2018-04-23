package com.taras.murzenkov.factory.code;

import java.util.function.Supplier;

/**
 * Creates the particular button {@link Button}.
 * @author Taras Murzenkov
 */
public interface ButtonBuilder extends Supplier<Button> {
    /**
     * Builds the button
     * @return {@link Button}
     */
    Button get();
}
