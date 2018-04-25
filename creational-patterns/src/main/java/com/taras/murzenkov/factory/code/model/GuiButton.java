package com.taras.murzenkov.factory.code.model;

import com.taras.murzenkov.factory.code.Button;

/**
 * Gui button.
 *
 * @author Taras Murzenkov
 */
public class GuiButton implements Button {
    private StringBuilder stringBuilder = new StringBuilder();
    private int x, y, w, h;

    @Override
    public String render() {
        return stringBuilder.append("GuiButtonInfo Coordinates: ={")
                .append(x)
                .append(", ")
                .append(y)
                .append("}, ")
                .append("Shape: ={")
                .append(w)
                .append(", ")
                .append(h)
                .append("}").toString();
    }

    @Override
    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setShape(int w, int h) {
        this.w = w;
        this.h = h;
    }
}
