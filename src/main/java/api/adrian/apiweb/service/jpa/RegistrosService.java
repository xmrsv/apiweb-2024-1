package api.adrian.apiweb.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import api.adrian.apiweb.entity.Registros;
import api.adrian.apiweb.repository.RegistrosRepository;
import api.adrian.apiweb.service.IRegistrosService;

public class RegistrosService implements IRegistrosService {
// 
    @Autowired
    private RegistrosRepository registrosRepository;

    @Override
    public List<Registros> buscarTodos() {
        return registrosRepository.findAll();
    }
    
}
