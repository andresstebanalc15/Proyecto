package co.edu.ucentral.servicio.envios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.ucentral.servicio.envios.model.Envio;

public interface EnvioRepository extends JpaRepository<Envio, Long>{

    // @Query("select * from t_envios ")
    // public List<Envio> buscarEnviosCliente(Long id_cliente);
}
