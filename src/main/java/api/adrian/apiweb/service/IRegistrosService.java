package api.adrian.apiweb.service;

import java.util.List;
import java.util.Optional;

import api.adrian.apiweb.entity.Registros;

public interface IRegistrosService {
    List<Registros> buscarTodos();

    void guardar(Registros registro);
 
    void modificar(Registros registros);

    Optional<Registros> buscarId(Integer id);

    void eliminarId(Integer id);
}
