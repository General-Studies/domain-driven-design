package com.jetherrodrigues.ticket.domain.order.entities;

import com.jetherrodrigues.ticket.domain.client.entities.Client;
import com.jetherrodrigues.ticket.domain.order.types.OrderStatusType;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public final class Order {
    private String id;
    private OrderStatusType status = OrderStatusType.OPENED;
    private Client client;
    private CreditCard creditCard;
    private Set<Ticket> tickets = new TreeSet<>(Comparator.comparing(Ticket::getId));
}
