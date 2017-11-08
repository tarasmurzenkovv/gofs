package com.taras.murzenkov.behavior.chain.code.impl.filter;

import com.taras.murzenkov.behavior.chain.code.Filter;

public class FilterOnlyNumbers implements Filter {
    private Filter next;

    @Override
    public void doFilter(String message) {
        System.out.println(message);
        if(next != null){
            System.out.println("Filters only numbers");
            this.next.doFilter(message);
        }
    }

    @Override
    public void next(Filter filter) {
        this.next = filter;
    }
}
