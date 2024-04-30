package api.adrian.apiweb.service;

import java.util.List;
import java.util.Optional;

import api.adrian.apiweb.entity.Clientes;
import api.adrian.apiweb.entity.Registros;

public interface IClientesService {
    List<Clientes> buscarTodos();

    void guardar(Clientes registro);
 
    void modificar(Clientes registros);

    Optional<Clientes> buscarId(Integer id);

    void eliminarId(Integer id);
}
