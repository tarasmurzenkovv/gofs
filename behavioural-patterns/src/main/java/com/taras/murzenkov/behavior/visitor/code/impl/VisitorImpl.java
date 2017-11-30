package com.taras.murzenkov.behavior.visitor.code.impl;

import com.taras.murzenkov.behavior.visitor.code.Visitor;

/**
 * Implementation fo the {@link Visitor} for the {@link ServiceImpl}.
 *
 * @author Taras_Murzenkov
 */
public class VisitorImpl implements Visitor<ServiceImpl> {

    @Override
    public void visit(ServiceImpl service) {
        System.out.println("Vistor will change the internal state");
        final int numberToSet = 10;
        service.setNumber(numberToSet);
    }
}
