package api.adrian.apiweb.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.adrian.apiweb.entity.Registros;
import api.adrian.apiweb.repository.RegistrosRepository;
import api.adrian.apiweb.service.IRegistrosService;

@Service
public class RegistrosService implements IRegistrosService {
    @Autowired
    private RegistrosRepository registrosRepository;

    public List<Registros> buscarTodos() {
        return registrosRepository.findAll();
    }

    public void guardar(Registros registro) {
        registrosRepository.save(registro);
    }

    public void modificar(Registros registro) {
        registrosRepository.save(registro);
    }
    
}
