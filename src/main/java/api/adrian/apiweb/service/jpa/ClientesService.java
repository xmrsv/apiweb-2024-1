package api.adrian.apiweb.service.jpa;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.adrian.apiweb.entity.Clientes;
import api.adrian.apiweb.entity.Registros;
import api.adrian.apiweb.repository.ClientesRepository;
import api.adrian.apiweb.repository.RegistrosRepository;
import api.adrian.apiweb.service.IClientesService;

@Service
public class ClientesService implements IClientesService {
    @Autowired
    private ClientesRepository clientesRepository;

    public List<Clientes> buscarTodos() {
        return clientesRepository.findAll();
    }

    public void guardar(Clientes registro) {
        clientesRepository.save(registro);
    }

    public void modificar(Clientes registro) {
        clientesRepository.save(registro);
    }

    public Optional<Clientes> buscarId(Integer id) {
        return clientesRepository.findById(id);
    }

    public void eliminarId(Integer id) {
        clientesRepository.deleteById(id);
    }
}
