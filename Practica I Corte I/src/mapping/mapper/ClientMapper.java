/*package mapping.mapper;

import domain.models.Client;
import mapping.dtos.ClientDto;

import java.util.List;

public class ClientMapper {

    public static ClientDto mapFrom(Client source){
        return new ClientDto(source.getId(),
                source.getName(),
                source.getTier());
    }

    public static Client mapFrom(ClientDto source){
        return new Client(source.id(),
                source.name(),
                source.tier());
    }


    public static List<Client> mapFrom(List<ClientDto> source){
        return source.parallelStream()
                .map(e -> mapFrom(e))
                .toList();

    }

}*/