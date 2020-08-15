package com.jetherrodrigues.ticket.resource.client.repository;

import com.jetherrodrigues.ticket.resource.client.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientJpaRepository extends JpaRepository<ClientEntity, String> {
}
