package com.taras.murzenkov.behavior.chain.code.impl.filter;

import static java.util.Optional.ofNullable;

import com.taras.murzenkov.behavior.chain.code.Filter;

/**
 * This implementation of the {@link Filter} do filters vowels from the given {@link String}.
 *
 * @author Taras_Murzenkov
 */
public class FilterOnlyVowels implements Filter<String> {

    private Filter<String> next;

    @Override
    public void doFilter(final String source) {
        ofNullable(this.next).ifPresent(filter -> filter.doFilter(source));
    }

    @Override
    public void next(final Filter<String> filter) {
        this.next = filter;
    }
}
