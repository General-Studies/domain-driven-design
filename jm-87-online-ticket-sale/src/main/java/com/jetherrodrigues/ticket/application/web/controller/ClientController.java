package com.jetherrodrigues.ticket.application.web.controller;

import com.jetherrodrigues.ticket.application.web.response.ClientResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Set;

public interface ClientController {

    @GetMapping(produces = "application/vnd.ticket-sale.clients-v1+json")
    ResponseEntity<Set<ClientResponse>> getClients();

    @GetMapping(value = "/{id}", produces = "application/vnd.ticket-sale.client_detail-v1+json")
    ResponseEntity<ClientResponse> getClient(@PathVariable final String id);

}
