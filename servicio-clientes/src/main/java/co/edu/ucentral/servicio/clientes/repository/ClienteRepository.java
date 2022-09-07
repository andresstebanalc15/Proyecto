package co.edu.ucentral.servicio.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.clientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
