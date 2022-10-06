package mintic.sergio.reto3ciclo3.Repositorio;

import mintic.sergio.reto3ciclo3.Interface.ClientInterface;
import mintic.sergio.reto3ciclo3.Modelo.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository

public class ClientRepositorio {
    @Autowired
    private ClientInterface clientCrudRepository;
    
      public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }
    
    public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }

    public Client save(Client client){
        return clientCrudRepository.save(client);
    }
}
