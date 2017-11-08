package com.taras.murzenkov.behavior.chain.code.impl.filter;

import com.taras.murzenkov.behavior.chain.code.Filter;

public class FilterSpecialCharacters implements Filter {
    private Filter next;

    @Override
    public void doFilter(String message) {
        System.out.println(message);
        System.out.println("Filters only special characters");
        this.next.doFilter(message);
    }

    @Override
    public void next(Filter filter) {
        this.next = filter;
    }
}
