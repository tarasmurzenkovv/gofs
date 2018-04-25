package com.taras.murzenkov.factory.code.impl;

import com.taras.murzenkov.factory.code.Button;
import com.taras.murzenkov.factory.code.ButtonFactory;
import com.taras.murzenkov.factory.code.model.ButtonType;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * Impl of the {@link ButtonFactory}.
 *
 * @author Taras Murzenkov
 */
public class ButtonFactoryImpl implements ButtonFactory {
    private Map<ButtonType, Supplier<Button>> buttons = new HashMap<>();

    @Override
    public Button build(ButtonType buttonType) {
        return Optional.ofNullable(buttons.get(buttonType))
                .map(Supplier::get)
                .orElseThrow(() -> new IllegalStateException("Cannot resolve the builder for type" + buttonType));
    }

    @Override
    public void register(ButtonType buttonType, Supplier<Button> builder) {
        this.buttons.put(buttonType, builder);
    }
}
