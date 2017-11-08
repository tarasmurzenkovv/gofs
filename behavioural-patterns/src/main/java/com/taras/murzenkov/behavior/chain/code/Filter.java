package com.taras.murzenkov.behavior.chain.code;

public interface Filter {

    void doFilter(String message);

    void next(Filter filter);
}
