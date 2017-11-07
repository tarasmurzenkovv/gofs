package com.taras.murzenkov.behavior.visitor.code.impl;

import com.taras.murzenkov.behavior.visitor.code.Service;

/**
 * Implementation of the {@link Service}.
 *
 * @author Taras Murzenkov
 */
public class ServiceImpl implements Service<VisitorImpl> {
    private VisitorImpl visitor;
    private Integer number;

    @Override
    public void accept(VisitorImpl visitor) {
        this.visitor = visitor;
    }

    @Override
    public void doLogic() {
        System.out.println("Started doing logic ....");
        this.visitor.visit(this);
        System.out.println("Finished doing logic .... Current number is: " + number);
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
