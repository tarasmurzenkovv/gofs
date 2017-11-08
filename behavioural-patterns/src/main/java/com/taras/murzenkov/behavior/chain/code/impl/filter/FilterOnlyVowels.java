package com.taras.murzenkov.behavior.chain.code.impl.filter;

import com.taras.murzenkov.behavior.chain.code.Filter;

public class FilterOnlyVowels implements Filter {
    private Filter next;

    @Override
    public void doFilter(String message) {
        System.out.println(message);
        if (this.next != null) {
            System.out.println("Filters only vowels");
            this.next.doFilter(message);
        }
    }

    @Override
    public void next(Filter filter) {
        this.next = filter;
    }
}
