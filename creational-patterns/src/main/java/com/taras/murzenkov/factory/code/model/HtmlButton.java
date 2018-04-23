package com.taras.murzenkov.factory.code.model;

import com.taras.murzenkov.factory.code.Button;

public class HtmlButton implements Button {
    private StringBuilder stringBuilder = new StringBuilder();
    private int x,y, w, h;
    @Override
    public String render() {
        return stringBuilder.append("HtmlButtonInfo Coordinates: ={")
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
