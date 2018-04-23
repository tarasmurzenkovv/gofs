package com.taras.murzenkov.factory.code.impl;

import com.taras.murzenkov.factory.code.ButtonBuilder;
import com.taras.murzenkov.factory.code.model.HtmlButton;

import java.util.function.Supplier;

public class HtmlButtonBuilder implements ButtonBuilder {
    public HtmlButton get() {
        return new HtmlButton();
    }
}
