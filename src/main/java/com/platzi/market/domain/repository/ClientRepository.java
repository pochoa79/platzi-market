package com.platzi.market.domain.repository;

import com.platzi.market.domain.Client;

import java.util.List;

public interface ClientRepository {

    List<Client> getAll();

    Client save(Client client);
}
