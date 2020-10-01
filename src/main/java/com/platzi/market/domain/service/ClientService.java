package com.platzi.market.domain.service;

import com.platzi.market.domain.Client;
import com.platzi.market.domain.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll() {
        return clientRepository.getAll();
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }


}
