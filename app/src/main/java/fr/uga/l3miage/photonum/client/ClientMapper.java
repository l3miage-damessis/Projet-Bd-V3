package fr.uga.l3miage.photonum.client;

import fr.uga.l3miage.photonum.data.domain.Client;
import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientDTO entityToDTO(Client client);

    Collection<ClientDTO> entityToDTO(Iterable<Client> clients);

    Client dtoToEntity(ClientDTO client);

    Collection<Client> dtoToEntity(Iterable<ClientDTO> clients);
}