package co.edu.ucentral.servicio.envios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.servicio.envios.model.Producto;

public interface EnvioRepository extends JpaRepository<Envio, Long>{

}
