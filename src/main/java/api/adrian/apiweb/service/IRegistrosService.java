package api.adrian.apiweb.service;

import java.util.List;

import api.adrian.apiweb.entity.Registros;

public interface IRegistrosService {
    List<Registros> buscarTodos();

    void guardar(Registros registro);
 
    void modificar(Registros registros);
}
