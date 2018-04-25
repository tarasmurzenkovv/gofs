package com.taras.murzenkov.factory.code.impl;

import com.taras.murzenkov.factory.code.Button;
import com.taras.murzenkov.factory.code.ButtonBuilder;
import com.taras.murzenkov.factory.code.model.HtmlButton;


/**
 * Builds the {@link HtmlButton}.
 *
 * @author Taras Murzenkov
 */
public class HtmlButtonBuilder implements ButtonBuilder {

    /**
     * Builds the {@link HtmlButton}.
     *
     * @return {@link HtmlButton}.
     */
    public Button get() {
        return new HtmlButton();
    }
}
