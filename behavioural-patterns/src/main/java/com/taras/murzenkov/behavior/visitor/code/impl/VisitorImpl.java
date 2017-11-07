package com.taras.murzenkov.behavior.visitor.code.impl;

import com.taras.murzenkov.behavior.visitor.code.Visitor;

public class VisitorImpl implements Visitor<ServiceImpl> {
    @Override
    public void visit(ServiceImpl service) {
        System.out.println("Vistor will change the internal state");
        service.setNumber(10);
    }
}
