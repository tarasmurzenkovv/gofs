package com.taras.murzenkov.behavior.chain.code.impl.filter;


import static java.util.Optional.ofNullable;

import com.taras.murzenkov.behavior.chain.code.Filter;

/**
 * This implementation of the {@link Filter} do filters special characters from the given {@link String}.
 *
 * @author Taras_Murzenkov
 */
public class FilterSpecialCharacters implements Filter<String> {

    private Filter<String> next;

    @Override
    public void doFilter(String message) {
        ofNullable(this.next).ifPresent(filter -> filter.doFilter(message));
    }

    @Override
    public void next(Filter<String> filter) {
        this.next = filter;
    }
}
