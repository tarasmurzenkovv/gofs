package com.taras.murzenkov.factory.code;

import com.taras.murzenkov.factory.code.model.ButtonType;

import java.util.function.Supplier;

/**
 * Factory service to create multiple types of the {@link Button}.
 *
 * @author Taras Murzenkov
 */
public interface ButtonFactory {
    /**
     * Builds the {@link Button} by the provided type.
     *
     * @param buttonType {@link ButtonType}
     * @return {@link Button}
     */
    Button build(ButtonType buttonType);

    /**
     * Registers the supplier aka builder to extend the {@link ButtonFactory} functionality.
     *
     * @param builder    {@link Supplier}
     * @param buttonType {@link ButtonType}
     */
    void register(ButtonType buttonType, Supplier<Button> builder);
}
