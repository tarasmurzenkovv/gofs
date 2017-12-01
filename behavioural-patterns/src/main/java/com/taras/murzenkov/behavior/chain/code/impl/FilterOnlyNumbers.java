package com.taras.murzenkov.behavior.chain.code.impl;

import static java.util.Optional.ofNullable;

import com.taras.murzenkov.behavior.chain.code.Filter;

/**
 * This implementation of the {@link Filter} do filters numbers from the given {@link String}.
 *
 * @author Taras_Murzenkov
 */
public class FilterOnlyNumbers implements Filter<String> {

    private Filter<String> next;

    @Override
    public void doFilter(final String source) {
        final String withoutNumbersString = filterOutNumbers(source);
        delegateToNextFilter(withoutNumbersString);
    }

    @Override
    public void next(final Filter<String> filter) {
        this.next = filter;
    }

    private String filterOutNumbers(final String source) {
        return source.replaceAll("\\d+", "");
    }

    private void delegateToNextFilter(final String withoutNumbersString) {
        ofNullable(this.next)
            .ifPresent(stringFilter -> stringFilter.doFilter(withoutNumbersString));
    }
}
