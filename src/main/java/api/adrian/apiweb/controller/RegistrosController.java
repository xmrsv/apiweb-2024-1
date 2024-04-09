package api.adrian.apiweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.adrian.apiweb.entity.Registros;
import api.adrian.apiweb.service.IRegistrosService;

@RestController
@RequestMapping("/apispring")
public class RegistrosController {
    @Autowired
    private IRegistrosService registrosService;

    @RequestMapping("/registros")
    public List<Registros> listar() {
        return registrosService.buscarTodos();
    }

}
