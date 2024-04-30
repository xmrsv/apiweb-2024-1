package api.adrian.apiweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import api.adrian.apiweb.entity.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Integer> {

}
