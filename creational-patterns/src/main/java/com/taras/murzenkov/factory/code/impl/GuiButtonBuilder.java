package com.taras.murzenkov.factory.code.impl;

import com.taras.murzenkov.factory.code.Button;
import com.taras.murzenkov.factory.code.ButtonBuilder;
import com.taras.murzenkov.factory.code.model.GuiButton;

/**
 * Builds the {@link GuiButton}.
 *
 * @author Taras Murzenkov
 */
public class GuiButtonBuilder implements ButtonBuilder {

    private static final int X = 10;
    private static final int Y = 10;
    private static final int W = 10;
    private static final int H = 10;

    /**
     * Builds the {@link GuiButton}.
     *
     * @return {@link GuiButton}.
     */
    public Button get() {
        GuiButton guiButton = new GuiButton();
        guiButton.setCoordinates(X, Y);
        guiButton.setShape(W, H);
        return guiButton;
    }
}
