package com.platzi.market.domain.repository;

import com.platzi.market.domain.Client;

import java.util.List;
import java.util.Optional;

public interface ClientRepository {

    List<Client> getAll();

    Client save(Client client);

    Optional<Client> findByIdCliente(String clientId);
}
