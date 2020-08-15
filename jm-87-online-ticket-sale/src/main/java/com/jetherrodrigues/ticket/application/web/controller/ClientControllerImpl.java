package com.jetherrodrigues.ticket.application.web.controller;

import com.jetherrodrigues.ticket.application.web.response.ClientResponse;
import com.jetherrodrigues.ticket.domain.client.ClientService;
import com.jetherrodrigues.ticket.domain.client.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/clients")
public class ClientControllerImpl implements ClientController {

    private final ClientService clientService;

    public ClientControllerImpl(final ClientService clientService) {
        this.clientService = clientService;
    }

    @Override
    public ResponseEntity<ClientResponse> getClient(final String id) {
        final Client client = clientService.getOne(id);
        return ResponseEntity.ok().body(ClientResponse.from(client));
    }

    @Override
    public ResponseEntity<Set<ClientResponse>> getClients() {
        final Set<ClientResponse> clients = clientService.findAll()
                .stream().map(ClientResponse::from).collect(Collectors.toSet());
        return ResponseEntity.ok().body(clients);
    }

}
