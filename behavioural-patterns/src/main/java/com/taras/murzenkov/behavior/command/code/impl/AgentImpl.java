package com.taras.murzenkov.behavior.command.code.impl;

import com.taras.murzenkov.behavior.command.code.Agent;
import com.taras.murzenkov.behavior.command.code.Order;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Executes the recieved commands here command is modelled by class {@link Order}.
 * @author Taras Murzenkov
 */
public class AgentImpl implements Agent {
    private final Queue<Order> queue = new ArrayBlockingQueue<>(10);
    @Override
    public void placeOrder(Order order) {
        queue.add(order);
        queue.poll().execute();
    }
}
