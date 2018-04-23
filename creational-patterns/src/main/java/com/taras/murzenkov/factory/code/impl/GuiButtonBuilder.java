package com.taras.murzenkov.factory.code.impl;

import com.taras.murzenkov.factory.code.ButtonBuilder;
import com.taras.murzenkov.factory.code.model.GuiButton;

public class GuiButtonBuilder implements ButtonBuilder {
    public GuiButton get() {
        GuiButton guiButton = new GuiButton();
        guiButton.setCoordinates(10, 10);
        guiButton.setShape(10, 10);
        return guiButton;
    }
}
