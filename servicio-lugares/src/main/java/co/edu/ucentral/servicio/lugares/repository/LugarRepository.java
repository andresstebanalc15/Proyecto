package co.edu.ucentral.servicio.lugares.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.lugares.model.Lugar;

public interface LugarRepository extends JpaRepository<Lugar, Long>{

}
