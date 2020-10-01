package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Client;
import com.platzi.market.persistence.crud.ClienteCrudRepository;
import com.platzi.market.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ClienteCrudRepository.class})
public interface ClientMapper {


    @Mappings({
            @Mapping(source = "id", target = "idClient"),
            @Mapping(source = "nombre", target = "fistname"),
            @Mapping(source = "apellidos", target = "lastname"),
            @Mapping(source = "direccion", target = "direction"),
            @Mapping(source = "celular", target = "phone"),
            @Mapping(source = "correoElectronico", target = "email")
    })
    Client toClient(Cliente cliente);

    List<Client> toClients(List<Cliente> clientes);

    @InheritInverseConfiguration
    Cliente toCliente(Client client);


}
