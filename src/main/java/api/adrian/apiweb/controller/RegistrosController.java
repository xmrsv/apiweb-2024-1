package api.adrian.apiweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import api.adrian.apiweb.entity.Registros;
import api.adrian.apiweb.service.IRegistrosService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/apispring")
public class RegistrosController {
    @Autowired
    private IRegistrosService registrosService;

    @GetMapping("/registros")
    public List<Registros> listar() {
        return registrosService.buscarTodos();
    }

    @PostMapping("/registros")
    public Registros guardar(@RequestBody Registros registro) {
        registrosService.guardar(registro);
        return registro;
    }

    @PutMapping("/registros")
    public Registros modificar(@RequestBody Registros registro) {
        registrosService.modificar(registro);
        return registro;
    }

    @GetMapping("/registros/{id}")
    public Optional<Registros> buscarId(@PathVariable("id") Integer id) {
        return registrosService.buscarId(id);
    }
}
