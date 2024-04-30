package api.adrian.apiweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.adrian.apiweb.entity.Clientes;
import api.adrian.apiweb.entity.Registros;
import api.adrian.apiweb.service.IClientesService;
import api.adrian.apiweb.service.IRegistrosService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/apispring")
public class ClientesController {
    @Autowired
    private IClientesService clientesService;

    @GetMapping("/clientes")
    public List<Clientes> listar() {
        return clientesService.buscarTodos();
    }

    @PostMapping("/clientes")
    public Clientes guardar(@RequestBody Clientes registro) {
        clientesService.guardar(registro);
        return registro;
    }

    @PutMapping("/clientes")
    public Clientes modificar(@RequestBody Clientes registro) {
        clientesService.modificar(registro);
        return registro;
    }

    @GetMapping("/clientes/{id}")
    public Optional<Clientes> buscarId(@PathVariable("id") Integer id) {
        return clientesService.buscarId(id);
    }

    @DeleteMapping("/clientes/{id}")
    public void eliminarId(@PathVariable("id") Integer id) {
        clientesService.eliminarId(id);
    }
}
