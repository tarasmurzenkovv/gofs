package com.taras.murzenkov.factory.code;

/**
 * Defines the type of the button
 *
 * @author Taras Murzenkov.
 */
public interface Button {

    /**
     * Render the button.
     * @return {@link String}
     */
    String render();

    /**
     * Sets coordinates.
     * @param x - {@link int}
     * @param y - {@link int}
     */
    void setCoordinates(int x, int y);

    /**
     * Sets shape.
     * @param w - {@link int}
     * @param h - {@link int}
     */
    void setShape(int w, int h);

}
